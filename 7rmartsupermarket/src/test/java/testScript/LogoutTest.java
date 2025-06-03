package testScript;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;
import pages.ManageNewsPage;

public class LogoutTest extends Base {
	@Test
public void logoutTest()
{
	String username="admin";//credentials
	String password="admin"; 
	LoginPage loginpage=new LoginPage(driver);//we need to pass the credentials to the loginpage so create obj of login page and pass driver as an arg
	loginpage.enterTheUsername(username);
	loginpage.enterThePassword(password);
	loginpage.clickTheSignInButton();
	LogoutPage obj= new LogoutPage(driver);
	obj.adminMethod();
	obj.logoutMethod();
}
}
