package testScript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	/*public LoginTest(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}*/
	@Test(groups= {"regression"},retryAnalyzer=retry.Retry.class)//retry-package
	
	public void loginTest() throws IOException//testcase is given and inside that credentials are given
	{
	//String username="admin";//credentials
	//String password="admin"; 
		String username=ExcelUtility.getStringData(1, 0, "loginpage");
		String password=ExcelUtility.getStringData(1, 1, "loginpage");
	LoginPage loginpage=new LoginPage(driver);//we need to pass the credentials to the loginpage so create obj of login page and pass driver as an arg
	loginpage.enterTheUsername(username);
	loginpage.enterThePassword(password);
	loginpage.clickTheSignInButton();
	boolean ishomepageavailable=loginpage.isDashboardDisplay();
	Assert.assertTrue(ishomepageavailable);
	}
	@Test
	public void loginTest1()//testcase is given and inside that credentials are given
	{
	String username="abcd";//credentials of false username and true password
	String password="admin"; 
	LoginPage loginpage=new LoginPage(driver);//we need to pass the credentials to the loginpage so create obj of login page and pass driver as an arg
	loginpage.enterTheUsername(username);
	loginpage.enterThePassword(password);
	loginpage.clickTheSignInButton();
	boolean isalertavailable=loginpage.isAlertDisplay();
	Assert.assertTrue(isalertavailable);
	}
	@Test
	public void loginTest2()//testcase is given and inside that credentials are given
	{
	String username="admin";//credentials of T username and F password
	String password="admin123"; 
	LoginPage loginpage=new LoginPage(driver);//we need to pass the credentials to the loginpage so create obj of login page and pass driver as an arg
	loginpage.enterTheUsername(username);
	loginpage.enterThePassword(password);
	loginpage.clickTheSignInButton();
	boolean isalertavailable=loginpage.isAlertDisplay();
	Assert.assertTrue(isalertavailable);
	}
	@Test
	public void loginTest3()//testcase is given and inside that credentials are given
	{
	String username="admin12";//credentials of F username and F password
	String password="admin34"; 
	LoginPage loginpage=new LoginPage(driver);//we need to pass the credentials to the loginpage so create obj of login page and pass driver as an arg
	loginpage.enterTheUsername(username);
	loginpage.enterThePassword(password);
	loginpage.clickTheSignInButton();
	boolean isalertavailable=loginpage.isAlertDisplay();
	Assert.assertTrue(isalertavailable);
	}
}
