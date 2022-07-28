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

public class Login extends BaseTest {

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
	
	driver.findElementByAccessibilityId("Login").click();
	logger.log(Level.INFO, "Login Tab is selected");
	
	driver.findElementByXPath("//android.widget.TextView[@text = 'Sign up']").click();
	logger.log(Level.INFO, "SignUp is started...!");
	
	driver.findElementByAccessibilityId("input-email").sendKeys("email@gmail.com");
	
	driver.findElementByAccessibilityId("input-password").sendKeys("test@123");
	
	driver.findElementByAccessibilityId("input-repeat-password").sendKeys("test@123");
	
	driver.findElementByAccessibilityId("button-SIGN UP").click();
	logger.log(Level.INFO, "Sign Up Button is Clicked");
	
	driver.findElementById("android:id/button1").click();
	logger.log(Level.INFO, "SignUp done Successfully");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElementByXPath("//android.widget.TextView[@text = 'Login']").click();
	logger.log(Level.INFO, "Login Tab is selected");
	
	//driver.findElementByAccessibilityId("input-email").sendKeys("email@gmail.com");
	
	//driver.findElementByAccessibilityId("input-password").sendKeys("test@123");
	
	driver.findElementByAccessibilityId("button-LOGIN").click();
	
	driver.findElementById("android:id/button1").click();	
	logger.log(Level.INFO, "Login done Successfully");
	}
	
	
	@AfterMethod()
	public void TearDown() {
		System.out.println("Current Activity is-"+driver.currentActivity());
		driver.quit();	
	}
	
}	