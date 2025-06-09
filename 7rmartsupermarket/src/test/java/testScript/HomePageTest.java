package testScript;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.HomePage;
import pages.ManageNewsPage;

public class HomePageTest extends Base {
	HomePage homepage;
	@Test(description="Verify whether the user is able to logout sucessfully")
public void verifyWhetherUserIsAbleToLogout()
{
	String username="admin";//credentials
	String password="admin"; 
	LoginPage loginpage=new LoginPage(driver);//we need to pass the credentials to the loginpage so create obj of login page and pass driver as an arg
	loginpage.enterTheUsername(username).enterThePassword(password);
	homepage=loginpage.clickTheSignInButton();
	//HomePage obj= new HomePage(driver);
	homepage.adminMethod();
	homepage .logoutMethod();
}
}
