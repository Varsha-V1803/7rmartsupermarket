package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LogoutPage {
	public WebDriver driver;
	public LogoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

		@FindBy(xpath="//a[@class='nav-link' and @data-toggle='dropdown'] ")WebElement admin;
		@FindBy(xpath="//a[contains(@href,'.com/admin/logout')]")WebElement logout;
		
		public void adminMethod()
		{
			admin.click();
		}
		public void logoutMethod()
		{
			logout.click();
		}
	}

