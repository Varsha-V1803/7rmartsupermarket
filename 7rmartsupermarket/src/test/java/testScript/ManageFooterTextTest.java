package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageContactPage;
import pages.ManageFooterTextPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageFooterTextTest extends Base {
	ManageFooterTextPage managefootertextpage;
	HomePage homepage;

	@Test(description = "Verify whether the user is able to add a new information to the manage footer page sucessfully")
	public void verifyWhetherUserIsAbleToCreateNewFooterTextInformation() throws IOException {
		// String username="admin";//credentials
		// String password="admin";
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);// we need to pass the credentials to the loginpage so create obj of
													// login page and pass driver as an arg
		loginpage.enterTheUsername(username).enterThePassword(password);
		homepage = loginpage.clickTheSignInButton();
		// ManageFooterTextPage obj= new ManageFooterTextPage(driver);
		String add = "Megha land,ktym";
		String mailid = "varsha123@gmail.com";
		String mob = "77889900455";
		managefootertextpage = homepage.moreInfoFooterPage();
		managefootertextpage.editMethod().address(add).editEmailField(mailid).phone(mob).updateMethod();
		boolean isalertavailable = managefootertextpage.isAlertDisplayed();
		Assert.assertTrue(isalertavailable, Constant.MANAGEFOOTERADDINFOERROR);
	}

	@Test(description = "Verify whether the user is able to view the updatebutton in manage footer page sucessfully")
	public void verifyWhetherUserIsAbleToDisplayFooterTextUpdateButton()

	{
		String username = "admin";// credentials
		String password = "admin";
		LoginPage loginpage = new LoginPage(driver);// we need to pass the credentials to the loginpage so create obj of
													// login page and pass driver as an arg
		loginpage.enterTheUsername(username).enterThePassword(password);
		homepage = loginpage.clickTheSignInButton();
		// ManageFooterTextPage obj= new ManageFooterTextPage(driver);
		managefootertextpage.isUpdateButtonDisplayed();
	}
}
