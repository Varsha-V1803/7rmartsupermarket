package testScript;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageCategoryPage;
import pages.ManageFooterTextPage;

public class ManageCategoryTest extends Base {
	@Test
public void manageCategoryTest() throws AWTException
{
	String username="admin";//credentials
	String password="admin"; 
	LoginPage loginpage=new LoginPage(driver);//we need to pass the credentials to the loginpage so create obj of login page and pass driver as an arg
	loginpage.enterTheUsername(username);
	loginpage.enterThePassword(password);
	loginpage.clickTheSignInButton();
	ManageCategoryPage obj= new ManageCategoryPage(driver);
	String name="Zipper Bottle";
	obj.moreInfo();
	obj.newMethod();
	obj.category(name);
	obj.selectGroups();
	obj.imageFile();
	//obj.showOnTopMenu();
	//obj.showOnLeftMenu();
	obj.saveMethod();
	boolean isalertavailable=obj.isAlertDisplayed();
	Assert.assertTrue(isalertavailable);
}
}
