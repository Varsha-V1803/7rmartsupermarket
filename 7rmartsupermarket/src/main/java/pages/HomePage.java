package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(@href,'tes.com/admin/list-admin')and @class='small-box-footer']")
	WebElement infoadmin;
	@FindBy(xpath = "//a[contains(@href,'tes.com/admin/list-contact')]")
	WebElement infocontact;
	@FindBy(xpath = "//a[contains(@href,'niqassosiates.com/admin/list-news')]")
	WebElement infonews;
	@FindBy(xpath = "//a[contains(@href,'qassosiates.com/admin/list-footertext')]")
	WebElement infofooter;
	@FindBy(xpath = "//a[contains(@href,'/admin/list-category')]")
	WebElement infocategory;
	@FindBy(xpath = "//a[@class='nav-link' and @data-toggle='dropdown'] ")
	WebElement admin;
	@FindBy(xpath = "//a[contains(@href,'.com/admin/logout')]")
	WebElement logout;

	// @FindBy(xpath="//a[contains(@href,'tes.com/admin/list-contact')]")WebElement
	// info;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alert;

	public AdminUsersPage moreInfoAdminUserPage() {
		infoadmin.click();
		return new AdminUsersPage(driver);
	}

	public ManageContactPage moreInfoContactPage() {

		infocontact.click();
		return new ManageContactPage(driver);
	}

	public ManageNewsPage moreInfoNewsPage() {
		infonews.click();
		return new ManageNewsPage(driver);
	}

	public ManageFooterTextPage moreInfoFooterPage() {
		infofooter.click();
		return new ManageFooterTextPage(driver);
	}

	public ManageCategoryPage moreInfoCategoryPage() {
		infocategory.click();
		return new ManageCategoryPage(driver);
	}

	public void adminMethod() {
		admin.click();
	}

	public void logoutMethod() {
		logout.click();
	}
}
