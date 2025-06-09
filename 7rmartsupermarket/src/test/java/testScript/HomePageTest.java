package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.HomePage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class HomePageTest extends Base {
	HomePage homepage;

	@Test(description = "Verify whether the user is able to logout sucessfully")
	public void verifyWhetherUserIsAbleToLogout() throws IOException {
		// String username="admin";//credentials
		// String password="admin";
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);// we need to pass the credentials to the loginpage so create obj of
													// login page and pass driver as an arg
		loginpage.enterTheUsername(username).enterThePassword(password);
		homepage = loginpage.clickTheSignInButton();
		// HomePage obj= new HomePage(driver);
		homepage.adminMethod();
		homepage.logoutMethod();
	}
}
