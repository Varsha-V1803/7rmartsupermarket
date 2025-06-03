package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	public WebDriver driver;
	public ManageNewsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//a[contains(@href,'niqassosiates.com/admin/list-news')]")WebElement info;
@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement new1;
@FindBy(xpath="//textarea[@id='news']")WebElement text;
@FindBy(xpath="//button[text()='Save']")WebElement save1;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	public void moreInfo()
	{
		info.click();
	}
	public void newMethod()
	{
		new1.click();
	}
	public void textField(String texts)
	{
		text.sendKeys(texts);
	}
	public void save()
	{
		save1.click();
	}
	public boolean isAlertDisplayed()
	{
		return alert.isDisplayed();
}
}
