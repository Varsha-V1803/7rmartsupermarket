package testScript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategoryPage;
import pages.ManageContactPage;
import pages.ManageFooterTextPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base {
	ManageCategoryPage managecategorypage;
	HomePage homepage;

	@Test(description = "Verify whether the user is able to add a new category to the manage category page sucessfully")
	public void verifyWhetherUserIsAbleToCreateNewCategoryInformation() throws AWTException, IOException {
		// String username="admin";//credentials
		// String password="admin";
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);// we need to pass the credentials to the loginpage so create obj of
													// login page and pass driver as an arg
		loginpage.enterTheUsername(username).enterThePassword(password);
		homepage = loginpage.clickTheSignInButton();
		// ManageCategoryPage obj= new ManageCategoryPage(driver);
		//String product = "Zipper Bottle";
		String product = ExcelUtility.getStringData(1, 0, "managecategorypageproduct");
		managecategorypage = homepage.moreInfoCategoryPage();// more info is in home page and the control goes to
																// newspage
		managecategorypage.newMethod().category(product).selectGroups().imageFile().saveMethod();
		// managecategorypage.showOnTopMenu();
		// managecategorypage.showOnLeftMenu();
		boolean isalertavailable = managecategorypage.isAlertDisplayed();
		Assert.assertTrue(isalertavailable, Constant.MANAGECATEGORYADDINFOERROR);
	}
}
