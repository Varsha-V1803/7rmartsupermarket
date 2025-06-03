package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManageContactPage {
public WebDriver driver;
	public ManageContactPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(@href,'tes.com/admin/list-contact')]")WebElement info;
	@FindBy(xpath="//i[@class='fas fa-edit']")WebElement editbutton;
	@FindBy(xpath="//input[@id='email']")WebElement email;
	@FindBy(xpath="//input[@type='text' and @id='phone']")WebElement phone;
	@FindBy(xpath="//textarea[@id='content' and @name='address']")WebElement address;
	@FindBy(xpath="//textarea[@name='del_time' and @id='content']")WebElement deliverytime;
	@FindBy(xpath="//input[@id='del_limit' ]")WebElement deliverychargelimit;
	
	@FindBy(xpath="//button[@name='Update']")WebElement update;
	//@FindBy(xpath="//button[@class='btn btn-block-sm btn-info']")WebElement update;
	//@FindBy(xpath="//button[@type='submit' and @name='Update']")WebElement update;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
		public void moreInfo()
		{
		
			info.click();
		}
		public void editMethod()
		{
			
			editbutton.click();
		}
		public void phone(String phoneno)
		{
			
			phone.clear();
			phone.sendKeys(phoneno);
		} 
		public void editEmailField(String mail)
		{
			email.clear();
			email.sendKeys(mail);
		}
		public void address(String enteraddress)
		{
			address.clear();
			address.sendKeys(enteraddress);
		}
		public void deliveryTime(String deltime)
		{
			deliverytime.clear();
			deliverytime.sendKeys(deltime);
		}
		public void deliveryChargeLimit(String deltimelimit)
		{
			deliverychargelimit.clear();
			deliverychargelimit.sendKeys(deltimelimit);
		}
		
		public void updateMethod()
		{
			//JavascriptExecutor js=(JavascriptExecutor) driver;
			//js.executeScript("argument[0].click();", update);
			//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			//wait.until(ExpectedConditions.elementToBeClickable(update));
			//update.click();
			Actions actions=new Actions(driver);//action class
			actions.click(update).build().perform();
		}
		public boolean isAlertDisplayed()
		{
			return alert.isDisplayed();
	}
	}

