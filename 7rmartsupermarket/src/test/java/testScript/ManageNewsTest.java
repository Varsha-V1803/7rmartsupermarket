package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;

public class ManageNewsTest extends Base {
@Test
public void manageNewsTest()

{
	String username="admin";//credentials
	String password="admin"; 
	LoginPage loginpage=new LoginPage(driver);//we need to pass the credentials to the loginpage so create obj of login page and pass driver as an arg
	loginpage.enterTheUsername(username);
	loginpage.enterThePassword(password);
	loginpage.clickTheSignInButton();
	ManageNewsPage obj= new ManageNewsPage(driver);
	String news="Its raining today";
	obj.moreInfo();
	obj.newMethod();
	obj.textField(news);
	obj.save();
	boolean isalertavailable=obj.isAlertDisplayed();
	Assert.assertTrue(isalertavailable);
}
@Test
public void manageNewsTestNewsDelete()

{
	String username="admin";//credentials
	String password="admin"; 
	LoginPage loginpage=new LoginPage(driver);//we need to pass the credentials to the loginpage so create obj of login page and pass driver as an arg
	loginpage.enterTheUsername(username);
	loginpage.enterThePassword(password);
	loginpage.clickTheSignInButton();
	ManageNewsPage obj= new ManageNewsPage(driver);
	obj.moreInfo();
	obj.deleteMethod();
	boolean isalertavailable=obj.isDeleteAlertDisplayed();
	Assert.assertTrue(isalertavailable);
}
@Test
public void manageNewsTestSaveButtonDisplay()

{
	String username="admin";//credentials
	String password="admin"; 
	LoginPage loginpage=new LoginPage(driver);//we need to pass the credentials to the loginpage so create obj of login page and pass driver as an arg
	loginpage.enterTheUsername(username);
	loginpage.enterThePassword(password);
	loginpage.clickTheSignInButton();
	ManageNewsPage obj= new ManageNewsPage(driver);
	obj.moreInfo();
	obj.newMethod();
	obj.isSaveButtonDisplayed();
}
}