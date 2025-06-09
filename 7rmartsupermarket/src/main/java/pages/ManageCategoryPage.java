package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constant.Constant;
import utilities.FileUploadUtility;
import utilities.PageUtility;

public class ManageCategoryPage {
	// @FindBy(xpath="//a[contains(@href,'/admin/list-category')]")WebElement info;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger' and @onclick='click_button(1)']")
	WebElement newbutton;
	@FindBy(xpath = "//input[@id='category' and @name='category']")
	WebElement cat;
	@FindBy(xpath = "//li[@id='134-selectable']")
	WebElement selectgroups;
	@FindBy(xpath = "//input[@id='main_img']")
	WebElement imgfile;
	// @FindBy(xpath="//input[@type='radio' and @name='top_menu']")WebElement
	// topmenuradiobutton;
	// @FindBy(xpath="//input[@type='radio' and @name='show_home']")WebElement
	// leftmenuradiobutton;
	// @FindBy(xpath="//button[text()='Save']")WebElement savebutton;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	WebElement savebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alert;
	private WebDriver driver;

	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * public void moreInfoManageCategory() { info.click(); }
	 */
	public ManageCategoryPage newMethod() {
		newbutton.click();
		return this;
	}

	public ManageCategoryPage category(String categoryname) {
		cat.sendKeys(categoryname);
		return this;
	}

	public ManageCategoryPage selectGroups() {
		selectgroups.click();
		return this;
	}

	public ManageCategoryPage imageFile() throws AWTException {
		PageUtility pageutility = new PageUtility();
		pageutility.click(driver, imgfile);
		/*
		 * WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 * wait.until(ExpectedConditions.elementToBeClickable(imgfile));//A wait of 10s
		 * is applied to the button,explicit wait imgfile.click();
		 */
		// Actions actions=new Actions(driver);//action class
		// actions.click(imgfile).build().perform();
		/*
		 * StringSelection stringselect=new
		 * StringSelection("\"C:\\Users\\user\\Downloads\\Zipperbottle.jpg\"");//
		 * creating obj for StringSelection class
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect,
		 * null);//Toolkit is class and 3 of the are its methods like
		 * getDefaultToolkit().getSystemClipboard().setContents(stringselect, null) ,the
		 * path of the pdf are copied to clipboard Robot rob=new Robot();//creating obj
		 * for Robot class rob.delay(2500);//delay is given for file upload
		 * rob.keyPress(KeyEvent.VK_CONTROL);//used for file pasting
		 * rob.keyPress(KeyEvent.VK_V);//used for file pasting ,vk-virtual key
		 * rob.keyRelease(KeyEvent.VK_CONTROL);//if key is pressed it needs to be
		 * released rob.keyRelease(KeyEvent.VK_V);//if key is pressed it needs to be
		 * released rob.keyPress(KeyEvent.VK_ENTER); rob.keyRelease(KeyEvent.VK_ENTER);
		 */
		// String imagefilepath=Constant.IMAGEDATAFILE;
		FileUploadUtility fileuploadutility = new FileUploadUtility();
		fileuploadutility.fileuploadUsingRobertClass(imgfile, Constant.IMAGEDATAFILE);
		return this;

	}
	/*
	 * public void showOnTopMenu() { topmenuradiobutton.click(); } public void
	 * showOnLeftMenu() { leftmenuradiobutton.click(); }
	 */

	public ManageCategoryPage saveMethod() {
		// savebutton.click();
		// Actions actions=new Actions(driver);//action class
		// actions.click(savebutton).build().perform();
		PageUtility page = new PageUtility();
		page.click(driver, savebutton);
		return this;
	}

	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}
}
