package features;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basetest.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Forms extends BaseTest {

	public AndroidDriver<AndroidElement> driver;
	public static Logger logger = Logger.getLogger(Drag.class.getName());
	
	
	@BeforeMethod()
	public void InvokeApp() {
		driver = desiredcaps();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger.log(Level.INFO, "APK Launched Successfully");
	}
	
	
	@Test()
	public void InvokeTest() {
		
		driver.findElementByAccessibilityId("Forms").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByAccessibilityId("text-input").sendKeys("Gaurav Shuchi");
		logger.log(Level.INFO, "Name entered successfully in the Form");
		
		driver.findElementByAccessibilityId("switch").click();
		logger.log(Level.INFO, "Switch Button is clicked");
		
		driver.findElementByXPath("//android.widget.EditText[@text = 'Select an item...']").click();
		logger.log(Level.INFO, "Model Opens up to select a value");
		
		driver.findElementByXPath("//android.widget.CheckedTextView[@text = 'Appium is awesome']").click();
		logger.log(Level.INFO, "Appium is selected");
		
		driver.findElementByAccessibilityId("button-Active").click();
		logger.log(Level.INFO, "Active Button is clicked");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		driver.findElementByXPath("//android.widget.Button[@text = 'CANCEL']").click();
		logger.log(Level.INFO, "Button PopUp is closed");
		
	}
	
	@AfterMethod()
	public void TearDown() {
		System.out.println("Current Activity is-"+driver.currentActivity());
		driver.quit();	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
