package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	public static final int IMPLICIT_WAIT=10;
	public static final int EXPLICIT_WAIT=5;
	public static final int EXPLICIT_WAIT1=10;
	public static final int EXPLICIT_WAIT2=15;
	public static final int EXPLICIT_WAIT3=20;
	public static final int EXPLICIT_WAIT4=30;

	public void waitForElementToBeClickable(WebDriver driver,WebElement element) {
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		     wait.until(ExpectedConditions.elementToBeClickable(element));
		 }
	public void waitForElementToBeClickable1(WebDriver driver,WebElement element) {
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT1));
		     wait.until(ExpectedConditions.elementToBeClickable(element));
		 }
	public void waitForElementToBeClickable2(WebDriver driver,WebElement element) {
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT2));
		     wait.until(ExpectedConditions.elementToBeClickable(element));
		 }
	public void waitForElementToBeClickable3(WebDriver driver,WebElement element) {
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT3));
		     wait.until(ExpectedConditions.elementToBeClickable(element));
		 }
	public void waitForElementToBeClickable4(WebDriver driver,WebElement element) {
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT4));
		     wait.until(ExpectedConditions.elementToBeClickable(element));
		 }
}
