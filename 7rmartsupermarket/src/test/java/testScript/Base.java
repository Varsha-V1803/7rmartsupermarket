package testScript;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utilities.ScreenShotUtility;
import utilities.WaitUtility;

public class Base {

	public WebDriver driver;// global initialization of driver

	@BeforeMethod(alwaysRun = true)
	@Parameters("browser")
	public void browserIntialization(String browser) throws Exception// method used for initialize browser
	{

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			throw new Exception("invalid");
		}
		// driver=new ChromeDriver();//browser initialize step,driver is assigned or
		// initialized to driver reference variable
		// WebDriver driver=new EdgeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin");// used to launch url
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtility.IMPLICIT_WAIT));
		driver.manage().window().maximize();// used to maximize the window

	}

	@AfterMethod(alwaysRun = true) // given for regression
//	public void driverQuitAndClose() 
	// {
//	driver.quit();//used to close all the open windows
	// driver.close(); used to close the parent window

	// }
	public void browserQuit(ITestResult iTestResult) throws IOException {
		if (iTestResult.getStatus() == ITestResult.FAILURE) {
			ScreenShotUtility scrShot = new ScreenShotUtility(); // creating obj
			scrShot.getScreenShot(driver, iTestResult.getName());
		}

	}
}
