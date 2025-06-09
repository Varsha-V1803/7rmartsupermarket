package testScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.FakerUtility;

public class AdminUsersTest extends Base {
	AdminUsersPage adminuserspage;
	HomePage homepage;
	@Test(groups= {"regression"},description="Verify whether the user is able to add a new information in the adminusers page sucessfully",retryAnalyzer=retry.Retry.class)
public void verifyWhetherUserIsAbleToCreateNewAdminUser()
{
		String username="admin";//credentials
		String password="admin"; 
		//String usernamefield="admi";
		//String passwordfield="ad123";
		FakerUtility faker=new FakerUtility();
		String user=faker.creatARandomFirstName();//used for fake username generation and is present inside the fakerutility class
		String userpass=faker.creatARandomFirstName();//used for fake userpassword generation and is present inside the fakerutility class
		LoginPage loginpage=new LoginPage(driver);//we need to pass the credentials to the loginpage so create obj of login page and pass driver as an arg
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		homepage=loginpage.clickTheSignInButton();
		//AdminUsersPage obj=new AdminUsersPage(driver);
		adminuserspage=homepage.moreInfoAdminUserPage();
		adminuserspage.newMethod().enterTheUsername(user).enterThePassword(userpass).selectTheUserType().save();//chaining
		//adminusertest.enterTheUsername(user);
		//adminusertest.enterThePassword(userpass);
		//adminusertest.selectTheUserType();
		//adminusertest.save();
		boolean isalertavailable=adminuserspage.isAlertDisplay();
		Assert.assertTrue(isalertavailable,Constant.ADMINUSERSADDINFOERROR);
}
}

