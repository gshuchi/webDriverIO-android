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
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.ElementOption;

public class Drag extends BaseTest {

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
		
		driver.findElementByAccessibilityId("Drag").click();
		
		AndroidElement drag1 = driver.findElementByAccessibilityId("drag-l1");
		AndroidElement drop1 = driver.findElementByAccessibilityId("drop-l1");
		AndroidTouchAction action1 = new AndroidTouchAction(driver);
		action1.longPress(ElementOption.element(drag1)).waitAction().moveTo(ElementOption.element(drop1)).release().perform();
		logger.log(Level.INFO, "DragNDrop 1 happened Successfully");
		
		AndroidElement drag2 = driver.findElementByAccessibilityId("drag-l2");
		AndroidElement drop2 = driver.findElementByAccessibilityId("drop-l2");
		AndroidTouchAction action2 = new AndroidTouchAction(driver);
		action2.longPress(ElementOption.element(drag2)).waitAction().moveTo(ElementOption.element(drop2)).release().perform();
		logger.log(Level.INFO, "DragNDrop 2 Successfully");
		
		AndroidElement drag3 = driver.findElementByAccessibilityId("drag-l3");
		AndroidElement drop3 = driver.findElementByAccessibilityId("drop-l3");
		AndroidTouchAction action3 = new AndroidTouchAction(driver);
		action3.longPress(ElementOption.element(drag3)).waitAction().moveTo(ElementOption.element(drop3)).release().perform();
		logger.log(Level.INFO, "DragNDrop 3 Successfully");
		
		AndroidElement drag4 = driver.findElementByAccessibilityId("drag-r1");
		AndroidElement drop4 = driver.findElementByAccessibilityId("drop-r1");
		AndroidTouchAction action4 = new AndroidTouchAction(driver);
		action4.longPress(ElementOption.element(drag4)).waitAction().moveTo(ElementOption.element(drop4)).release().perform();
		logger.log(Level.INFO, "DragNDrop 4 Successfully");
		
		AndroidElement drag5 = driver.findElementByAccessibilityId("drag-r2");
		AndroidElement drop5 = driver.findElementByAccessibilityId("drop-r2");
		AndroidTouchAction action5 = new AndroidTouchAction(driver);
		action5.longPress(ElementOption.element(drag5)).waitAction().moveTo(ElementOption.element(drop5)).release().perform();
		logger.log(Level.INFO, "DragNDrop 5 Successfully");
		
		AndroidElement drag6 = driver.findElementByAccessibilityId("drag-r3");
		AndroidElement drop6 = driver.findElementByAccessibilityId("drop-r3");
		AndroidTouchAction action6 = new AndroidTouchAction(driver);
		action6.longPress(ElementOption.element(drag6)).waitAction().moveTo(ElementOption.element(drop6)).release().perform();
		logger.log(Level.INFO, "DragNDrop 6 Successfully");
		
		AndroidElement drag7 = driver.findElementByAccessibilityId("drag-c1");
		AndroidElement drop7 = driver.findElementByAccessibilityId("drop-c1");
		AndroidTouchAction action7 = new AndroidTouchAction(driver);
		action7.longPress(ElementOption.element(drag7)).waitAction().moveTo(ElementOption.element(drop7)).release().perform();
		logger.log(Level.INFO, "DragNDrop 7 Successfully");
		
		AndroidElement drag8 = driver.findElementByAccessibilityId("drag-c2");
		AndroidElement drop8 = driver.findElementByAccessibilityId("drop-c2");
		AndroidTouchAction action8 = new AndroidTouchAction(driver);
		action8.longPress(ElementOption.element(drag8)).waitAction().moveTo(ElementOption.element(drop8)).release().perform();
		logger.log(Level.INFO, "DragNDrop 8 Successfully");
		
		AndroidElement drag9 = driver.findElementByAccessibilityId("drag-c3");
		AndroidElement drop9 = driver.findElementByAccessibilityId("drop-c3");
		AndroidTouchAction action9 = new AndroidTouchAction(driver);
		action9.longPress(ElementOption.element(drag9)).waitAction().moveTo(ElementOption.element(drop9)).release().perform();
		logger.log(Level.INFO, "DragNDrop 9 Successfully");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger.log(Level.INFO, "Drag AND Drop Operation Completed Successfully");
		
		
	}
	
	
	
	
	
	
	@AfterMethod
	public void TearDown() {
		System.out.println("Current Activity is-"+driver.currentActivity());
		//driver.closeApp();
	}
	
	
}
