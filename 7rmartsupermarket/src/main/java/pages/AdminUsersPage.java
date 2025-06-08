package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class AdminUsersPage {
public WebDriver driver;
public AdminUsersPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	//@FindBy(xpath="//a[contains(@href,'tes.com/admin/list-admin') and ]")WebElement info;
	//@FindBy(xpath="//a[contains(@href,'tes.com/admin/list-admin')and @class='small-box-footer']")WebElement info;
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement newbutton;
	@FindBy(xpath="//input[@id='username']")WebElement usernames;
	@FindBy(xpath="//input[@id='password']")WebElement passwords;
	@FindBy(xpath="//select[@id='user_type']")WebElement usertypes;
	@FindBy(xpath="//button[@name='Create']")WebElement savebutton;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement alert;
	
	/*public void moreInfoAdminUserPage()
	{
		info.click();
	}*/
	public AdminUsersPage newMethod()
	{
		newbutton.click();
		return this;
	}
	public AdminUsersPage enterTheUsername(String user)
	{
		usernames.sendKeys(user);
		return this;
	}
	public AdminUsersPage enterThePassword(String pass)
	{
		passwords.sendKeys(pass);
		return this;
	}
	public AdminUsersPage selectTheUserType()
	{
		Select select=new Select(usertypes);
		select.selectByIndex(2);
		//PageUtility page=new PageUtility();
		//page.selectByIndex(alert, 0);
		return this;
	
	}
	public AdminUsersPage save()
	{
		Actions actions=new Actions(driver);//action class
		actions.click(savebutton).build().perform();
		//savebutton.click();
		return this;
	}
	public boolean isAlertDisplay()
	{
		return alert.isDisplayed();
	}
}
