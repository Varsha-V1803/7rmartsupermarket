package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
	ManageNewsPage managenewspage;// global dln of page obj
	HomePage homepage;

	@Test(description = "Verify whether the user is able to add a new news inforamtion to the manage news page sucessfully")
	public void verifyWhetherUserIsAbleToCreateNewsInformation() throws IOException

	{
		// String username="admin";//credentials
		// String password="admin";
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);// we need to pass the credentials to the loginpage so create obj of
													// login page and pass driver as an arg
		loginpage.enterTheUsername(username).enterThePassword(password);
		// loginpage.enterThePassword(password);
		homepage = loginpage.clickTheSignInButton();

		// ManageNewsPage obj= new ManageNewsPage(driver);
		//String news = "Its raining today";
		String news = ExcelUtility.getStringData(1, 0, "managenewspage");
		// obj.moreInfoNewsPage();
		managenewspage = homepage.moreInfoNewsPage();// more info is in home page and the control goes to newspage
		managenewspage.newMethod().textField(news).save();
		// managenewspage.textField(news);
		// managenewspage.save();
		boolean isalertavailable = managenewspage.isAlertDisplayed();
		Assert.assertTrue(isalertavailable, Constant.MANAGENEWSADDINFOERROR);
	}

	@Test(description = "Verify whether the user is able to delete a news inforamtion from the manage news page sucessfully")
	public void verifyWhetherUserIsAbleToDeleteNewsInformation() throws IOException

	{
		// String username="admin";//credentials
		// String password="admin";
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);// we need to pass the credentials to the loginpage so create obj of
													// login page and pass driver as an arg
		loginpage.enterTheUsername(username).enterThePassword(password);
		homepage = loginpage.clickTheSignInButton();
		// ManageNewsPage obj= new ManageNewsPage(driver);
		managenewspage = homepage.moreInfoNewsPage();
		managenewspage.deleteMethod();
		boolean isalertavailable = managenewspage.isDeleteAlertDisplayed();
		Assert.assertTrue(isalertavailable, Constant.MANAGENEWSDLTINFOERROR);
	}

	@Test(description = "Verify whether the user is able to view the save button in the manage news page sucessfully")
	public void verifyWhetherUserIsAbleToDisplayManageNewsUpdateButton() throws IOException

	{
		// String username="admin";//credentials
		// String password="admin";
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);// we need to pass the credentials to the loginpage so create obj of
													// login page and pass driver as an arg
		loginpage.enterTheUsername(username).enterThePassword(password);
		homepage = loginpage.clickTheSignInButton();
		// ManageNewsPage obj= new ManageNewsPage(driver);
		managenewspage = homepage.moreInfoNewsPage();
		managenewspage.newMethod().isSaveButtonDisplayed();
	}
}
