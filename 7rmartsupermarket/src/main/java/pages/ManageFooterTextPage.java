package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterTextPage {
	@FindBy(xpath="//a[contains(@href,'qassosiates.com/admin/list-footertext')]")WebElement info;
	@FindBy(xpath="//a[contains(@href,'m/admin/Footertext/edit?edit=1')]")WebElement edit;
	@FindBy(xpath="//textarea[@id='content' and @placeholder='Enter the Address']")WebElement address;
	@FindBy(xpath="//input[@id='email' and @name='email']")WebElement email;
	@FindBy(xpath="//input[@id='phone' and @name='phone']")WebElement phone;
	@FindBy(xpath="//button[@type='submit' and @name='Update']")WebElement update;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	private WebDriver driver;
	
	public ManageFooterTextPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void moreInfo()
	{
		info.click();
	}
	public void editMethod()
	{
		edit.click();
	}
	public void address(String enteraddress)
	{
		address.clear();
		address.sendKeys(enteraddress);
	} 
	public void editEmailField(String mail)
	{
		email.clear();
		email.sendKeys(mail);
	}
	public void phone(String phoneno)
	{
		
		phone.clear();
		phone.sendKeys(phoneno);
	}
	public void updateMethod()
	{
		Actions actions=new Actions(driver);//action class
		actions.click(update).build().perform();
	}
	public boolean isAlertDisplayed()
	{
		return alert.isDisplayed();
		
}
	public void isUpdateButtonDisplayed()
	{
		if(update.isDisplayed())
		{
			System.out.println("Update button is already displayed");
		}
		else
		{
			update.click();
			System.out.println("Update button is displayed");
		}
	}	
}
