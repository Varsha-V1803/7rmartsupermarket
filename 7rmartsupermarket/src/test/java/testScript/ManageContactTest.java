package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageContactPage;
import pages.ManageNewsPage;

public class ManageContactTest extends Base {
	ManageContactPage managecontactpage;
	HomePage homepage;
	@Test(description="Verify whether the user is able to add a new contact informationto the manage contact page sucessfully")
	public void verifyWhetherUserIsAbleToCreateNewContactInformation()
	
		{
			String username="admin";//credentials
			String password="admin"; 
			LoginPage loginpage=new LoginPage(driver);//we need to pass the credentials to the loginpage so create obj of login page and pass driver as an arg
			loginpage.enterTheUsername(username).enterThePassword(password);
			//loginpage.enterThePassword(password);
			homepage=loginpage.clickTheSignInButton();
			//ManageContactPage obj= new ManageContactPage(driver);
			String mailid="varsha123@gmail.com";
			String mob="77889900455";
			String add="Megha land,ktym";
			String time="20";
			String delchargelmt="30";
			managecontactpage=homepage.moreInfoContactPage();
			managecontactpage.editMethod().phone(mob).editEmailField(mailid).address(add).deliveryTime(time).editEmailField(delchargelmt).updateMethod();
			//managecontactpage.phone(mob);
			//managecontactpage.editEmailField(mailid);
			//managecontactpage.address(add);
			//managecontactpage.deliveryTime(time);
			//managecontactpage.deliveryChargeLimit(delchargelmt);
			//managecontactpage.updateMethod();
			boolean isalertavailable=managecontactpage.isAlertDisplayed();
			Assert.assertTrue(isalertavailable,Constant.MANAGECONTACTADDINFOERROR);
		}
	}
	

