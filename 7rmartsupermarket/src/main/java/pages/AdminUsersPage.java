package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	@FindBy(xpath="//a[contains(@href,'tes.com/admin/list-admin')and @class='small-box-footer']")WebElement info;
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement newbutton;
	@FindBy(xpath="//input[@id='username']")WebElement usernames;
	@FindBy(xpath="//input[@id='password']")WebElement passwords;
	@FindBy(xpath="//select[@id='user_type']")WebElement usertypes;
	@FindBy(xpath="//button[@name='Create']")WebElement savebutton;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement alert;
	
	public void moreInfo()
	{
		info.click();
	}
	public void newMethod()
	{
		newbutton.click();
	}
	public void enterTheUsername(String user)
	{
		usernames.sendKeys(user);
	}
	public void enterThePassword(String pass)
	{
		passwords.sendKeys(pass);
	}
	public void selectTheUserType()
	{
		//Select select=new Select(usertypes);
		//select.selectByIndex(2);
		PageUtility page=new PageUtility();
		page.selectByIndex(alert, 0);
	
	}
	public void save()
	{
		savebutton.click();
	}
	public boolean isAlertDisplay()
	{
		return alert.isDisplayed();
	}
}
