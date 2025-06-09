package testScript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import constant.Constant;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	/*
	 * public LoginTest(WebDriver driver) { // TODO Auto-generated constructor stub
	 * }
	 */
	@Test(groups = {
			"regression" }, description = "Verify whether the user is able to login to the application with correct username and correct password sucessfully", retryAnalyzer = retry.Retry.class) // retry-package

	public void verifyWhetherUserIsAbleToLoginWithCorrectUsernameCorrectPassword() throws IOException// testcase is
																										// given and
																										// inside that
																										// credentials
																										// are given
	{
		// String username="admin";//credentials
		// String password="admin";
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);// we need to pass the credentials to the loginpage so create obj of
													// login page and pass driver as an arg
		loginpage.enterTheUsername(username).enterThePassword(password).clickTheSignInButton();
		boolean ishomepageavailable = loginpage.isDashboardDisplay();
		Assert.assertTrue(ishomepageavailable, Constant.LOGINCORRECTUSERNAMECORRECTPASSWORD);
	}

	@Test(description = "Verify whether the user is able to login to the application with incorrect username and correct password sucessfully")

	public void verifyWhetherUserIsAbleToLoginWithInCorrectUsernameCorrectPassword() throws IOException// testcase is
																										// given and
																										// inside that
																										// credentials
																										// are given
	{
		// String username="abcd";//credentials of false username and true password
		// String password="admin";
		String username = ExcelUtility.getStringData(3, 0, "loginpage");
		String password = ExcelUtility.getStringData(3, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);// we need to pass the credentials to the loginpage so create obj of
													// login page and pass driver as an arg
		loginpage.enterTheUsername(username).enterThePassword(password).clickTheSignInButton();
		boolean isalertavailable = loginpage.isAlertDisplay();
		Assert.assertTrue(isalertavailable, Constant.LOGININCOORECTUSERNAMECORRECTPASSWORD);
	}

	@Test(description = "Verify whether the user is able to login to the application with correct username and incorrect password sucessfully")
	public void verifyWhetherUserIsAbleToLoginWithCorrectUsernameInCorrectPassword() throws IOException// testcase is
																										// given and
																										// inside that
																										// credentials
																										// are given
	{
		// String username="admin";//credentials of T username and F password
		// String password="admin123";
		String username = ExcelUtility.getStringData(2, 0, "loginpage");
		String password = ExcelUtility.getStringData(2, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);// we need to pass the credentials to the loginpage so create obj of
													// login page and pass driver as an arg
		loginpage.enterTheUsername(username).enterThePassword(password).clickTheSignInButton();
		boolean isalertavailable = loginpage.isAlertDisplay();
		Assert.assertTrue(isalertavailable, Constant.LOGININCORRECTUSERNAMEINCORRECTPASSWORD);
	}

	@Test(description = "Verify whether the user is able to login to the application with incorrect username and incorrect password sucessfully",dataProvider ="LoginProvider")
	public void verifyWhetherUserIsAbleToLoginWithInCorrectUsernameInCorrectPassword(String username,String password) throws IOException// testcase is
																											// given and
																											// inside
																											// that
																											// credentials
																											// are given
	{
		// String username="admin12";//credentials of F username and F password
		// String password="admin34";
		//String username = ExcelUtility.getStringData(4, 0, "loginpage");//readinf from excel
		//String password = ExcelUtility.getStringData(4, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);// we need to pass the credentials to the loginpage so create obj of
													// login page and pass driver as an arg
		loginpage.enterTheUsername(username).enterThePassword(password).clickTheSignInButton();
		boolean isalertavailable = loginpage.isAlertDisplay();
		Assert.assertTrue(isalertavailable, Constant.LOGININCORRECTUSERNAMEINCORRECTPASSWORD);
	}
	@DataProvider(name="LoginProvider")
	public Object[][] getDataFromTestData() throws IOException{
		return new Object[][] {{ExcelUtility.getStringData(4, 0,"loginpage"),ExcelUtility.getStringData(4,1,"loginpage")}};
}
}