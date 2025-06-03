package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageContactPage;
import pages.ManageNewsPage;

public class ManageContactTest extends Base {
	@Test
	public void manageContactTest()
	
		{
			String username="admin";//credentials
			String password="admin"; 
			LoginPage loginpage=new LoginPage(driver);//we need to pass the credentials to the loginpage so create obj of login page and pass driver as an arg
			loginpage.enterTheUsername(username);
			loginpage.enterThePassword(password);
			loginpage.clickTheSignInButton();
			ManageContactPage obj= new ManageContactPage(driver);
			String mailid="varsha123@gmail.com";
			String mob="77889900455";
			String add="Megha land,ktym";
			String time="20";
			String delchargelmt="30";
			obj.moreInfo();
			obj.editMethod();
			obj.phone(mob);
			obj.editEmailField(mailid);
			obj.address(add);
			obj.deliveryTime(time);
			obj.deliveryChargeLimit(delchargelmt);
			obj.updateMethod();
			obj.isAlertDisplayed();
			boolean isalertavailable=obj.isAlertDisplayed();
			Assert.assertTrue(isalertavailable);
		}
	}
	

