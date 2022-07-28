package features;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basetest.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class SwipeX extends BaseTest {

	AndroidDriver<AndroidElement> driver;
	public static Logger logger = Logger.getLogger(SwipeX.class.getName());
	
	
	@BeforeMethod()
	public void InvokeApp() {
		driver = desiredcaps();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger.log(Level.INFO, "APK Launched Successfully");
	}
	
	@Test()
	public void InvokeTest() {
		
		AndroidTouchAction action = new AndroidTouchAction(driver);
		
		driver.findElementByAccessibilityId("Swipe").click();
		
		//card1
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AndroidElement card1 = (AndroidElement)driver.findElementByXPath("(//android.view.ViewGroup[@content-desc=\"card\"])[1]");
		Point point1 = card1.getLocation();
		Dimension eleSize1 = card1.getSize();
		int centerX1 = point1.getX() + (eleSize1.getWidth() / 2);
		int centerY1 = point1.getY() + (eleSize1.getHeight() / 2);
		int moveToX1 = point1.getX();
		int moveToY1 = point1.getY() + (eleSize1.getHeight() /2);

		action.press(PointOption.point(centerX1,centerY1))
		      .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		      .moveTo(PointOption.point(moveToX1, moveToY1))
		      .release()
		      .perform();
		
		//card2
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AndroidElement card2 = (AndroidElement)driver.findElementByXPath("(//android.view.ViewGroup[@content-desc=\"card\"])[2]");
		Point point2 = card2.getLocation();
		Dimension eleSize2 = card2.getSize();
		int centerX2 = point2.getX() + (eleSize2.getWidth() / 2);
		int centerY2 = point2.getY() + (eleSize2.getHeight() / 2);
		int moveToX2 = point2.getX();
		int moveToY2 = point2.getY() + (eleSize2.getHeight() /2);

		action.press(PointOption.point(centerX2,centerY2))
		      .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		      .moveTo(PointOption.point(moveToX2, moveToY2))
		      .release()
		      .perform();
		
		//card3
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AndroidElement card3 = (AndroidElement)driver.findElementByXPath("(//android.view.ViewGroup[@content-desc=\"card\"])[3]");
		Point point3 = card3.getLocation();
		Dimension eleSize3 = card3.getSize();
		int centerX3 = point3.getX() + (eleSize3.getWidth() / 2);
		int centerY3 = point3.getY() + (eleSize3.getHeight() / 2);
		int moveToX3 = point3.getX();
		int moveToY3 = point3.getY() + (eleSize3.getHeight() /2);

		action.press(PointOption.point(centerX3,centerY3))
		      .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		      .moveTo(PointOption.point(moveToX3, moveToY3))
		      .release()
		      .perform();
		
		//card4
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AndroidElement card4 = (AndroidElement)driver.findElementByXPath("(//android.view.ViewGroup[@content-desc=\"card\"])[4]");
		Point point4 = card4.getLocation();
		Dimension eleSize4 = card4.getSize();
		int centerX4 = point4.getX() + (eleSize4.getWidth() / 2);
		int centerY4 = point4.getY() + (eleSize4.getHeight() / 2);
		int moveToX4 = point4.getX();
		int moveToY4 = point4.getY() + (eleSize4.getHeight() /2);

		action.press(PointOption.point(centerX4,centerY4))
		      .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		      .moveTo(PointOption.point(moveToX4, moveToY4))
		      .release()
		      .perform();
		
		//card5
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AndroidElement card5 = (AndroidElement)driver.findElementByXPath("(//android.view.ViewGroup[@content-desc=\"card\"])[5]");
		Point point5 = card5.getLocation();
		Dimension eleSize5 = card5.getSize();
		int centerX5 = point5.getX() + (eleSize5.getWidth() / 2);
		int centerY5 = point5.getY() + (eleSize5.getHeight() / 2);
		int moveToX5 = point5.getX();
		int moveToY5 = point5.getY() + (eleSize5.getHeight() /2);

		action.press(PointOption.point(centerX5,centerY5))
		      .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		      .moveTo(PointOption.point(moveToX5, moveToY5))
		      .release()
		      .perform();
		
		//card6
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AndroidElement card6 = (AndroidElement)driver.findElementByXPath("(//android.view.ViewGroup[@content-desc=\"card\"])[6]");
		Point point6 = card6.getLocation();
		Dimension eleSize6 = card6.getSize();
		int centerX6 = point6.getX() + (eleSize6.getWidth() / 2);
		int centerY6 = point6.getY() + (eleSize6.getHeight() / 2);
		int moveToX6 = point6.getX();
		int moveToY6 = point6.getY() + (eleSize6.getHeight() /2);

		action.press(PointOption.point(centerX6,centerY6))
		      .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		      .moveTo(PointOption.point(moveToX6, moveToY6))
		      .release()
		      .perform();
		
		System.out.println("Performed Swipe Successfully");
		
	}
	
	/*public void InvokeTest() {
		
		driver.findElementByAccessibilityId("Swipe").click();
			
		driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Carousel\"]/android.view.ViewGroup/android.view.ViewGroup[1]").click();
		driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Carousel\"]/android.view.ViewGroup/android.view.ViewGroup[2]").click();
		driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Carousel\"]/android.view.ViewGroup/android.view.ViewGroup[3]").click();
		driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Carousel\"]/android.view.ViewGroup/android.view.ViewGroup[4]").click();
		driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Carousel\"]/android.view.ViewGroup/android.view.ViewGroup[5]").click();
		driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Carousel\"]/android.view.ViewGroup/android.view.ViewGroup[6]").click();
		
		
		System.out.println("Performed Swipe Successfully");
		
		/*@SuppressWarnings("rawtypes")
		TouchAction t = new TouchAction(driver);
		t.longPress(PointOption.point(1253,1984))
		 .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
		 .moveTo(PointOption.point(160,1890))
		 .release()
		 .perform();
	     */
		
		/*AndroidElement card1 = (AndroidElement)driver.findElements(By.className("android.view.ViewGroup")).get(0);
		action.press(ElementOption.element(card1))
			  .waitAction()
			  .moveTo(PointOption.point(-40, 1735))
			  .release()
			  .perform();
		*/
			
		
	
	@AfterMethod
	public void TearDown() {
		System.out.println("Current Activity is-"+driver.currentActivity());
		driver.closeApp();
	}
}
