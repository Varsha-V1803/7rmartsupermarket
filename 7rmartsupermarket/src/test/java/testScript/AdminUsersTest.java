package testScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.LoginPage;
import utilities.FakerUtility;

public class AdminUsersTest extends Base {
	@Test(groups= {"regression"},retryAnalyzer=retry.Retry.class)
public void adminUsersTest()
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
		loginpage.clickTheSignInButton();
		AdminUsersPage obj=new AdminUsersPage(driver);
		obj.moreInfo();
		obj.newMethod();
		obj.enterTheUsername(user);
		obj.enterThePassword(userpass);
		obj.selectTheUserType();
		obj.save();
		boolean isalertavailable=obj.isAlertDisplay();
		Assert.assertTrue(isalertavailable);
}
}
