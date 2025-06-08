package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	public WebDriver driver;
	public ManageNewsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
//@FindBy(xpath="//a[contains(@href,'niqassosiates.com/admin/list-news')]")WebElement info;
@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement new1;
@FindBy(xpath="//textarea[@id='news']")WebElement text;
@FindBy(xpath="//button[text()='Save']")WebElement save1;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
@FindBy(xpath="//a[contains(@href,'/admin/news/delete') and contains(@class,'btn-danger')]")WebElement delete;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement deletealert;
	/*public void moreInfoNewsPage()
	{
		info.click();
	}*/
	public ManageNewsPage newMethod()
	{
		new1.click();
		return this;
	}
	public ManageNewsPage textField(String texts)
	{
		text.sendKeys(texts);
		return this;
	}
	public ManageNewsPage save()
	{
		Actions actions=new Actions(driver);//action class
		actions.click(save1).build().perform();
		//save1.click();
		return this;
	}
	public boolean isAlertDisplayed()
	{
		return alert.isDisplayed();
}
	public ManageNewsPage deleteMethod()
	{
		delete.click();
		return this;
	}
	public boolean isDeleteAlertDisplayed()
	{
		driver.switchTo().alert().accept();
		return deletealert.isDisplayed();
	}
	public ManageNewsPage isSaveButtonDisplayed()
	{
		if(save1.isDisplayed())
		{
			System.out.println("Save button is already displayed");
		}
		else
		{
			save1.click();
			System.out.println("Save button is displayed");
		}
		return this;
	}	

}
