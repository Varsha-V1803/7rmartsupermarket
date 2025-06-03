package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageContactPage;
import pages.ManageFooterTextPage;
import pages.ManageNewsPage;

public class ManageFooterTextTest extends Base {
	@Test
 public void manageFooterTextTest()
 {
	 String username="admin";//credentials
		String password="admin"; 
		LoginPage loginpage=new LoginPage(driver);//we need to pass the credentials to the loginpage so create obj of login page and pass driver as an arg
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignInButton();
		ManageFooterTextPage obj= new ManageFooterTextPage(driver);
		String add="Megha land,ktym";
		String mailid="varsha123@gmail.com";
		String mob="77889900455";
		obj.moreInfo();
		obj.editMethod();
		obj.address(add);
		obj.editEmailField(mailid);
		obj.phone(mob);
		obj.updateMethod();
		boolean isalertavailable=obj.isAlertDisplayed();
		Assert.assertTrue(isalertavailable);
 }
	@Test
	public void  manageFooterTextTestUpdateButtonDisplay()

	{
		String username="admin";//credentials
		String password="admin"; 
		LoginPage loginpage=new LoginPage(driver);//we need to pass the credentials to the loginpage so create obj of login page and pass driver as an arg
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignInButton();
		ManageFooterTextPage obj= new ManageFooterTextPage(driver);
		obj.isUpdateButtonDisplayed();
	}
}
