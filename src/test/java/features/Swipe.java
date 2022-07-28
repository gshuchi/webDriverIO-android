package features;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basetest.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class Swipe extends BaseTest{

	AndroidDriver<AndroidElement> driver;
	public static Logger logger = Logger.getLogger(Swipe.class.getName());
	
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
		
		//Swipe from right to left
		for(int i= 0; i<=6; i++)
		{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
			Dimension dim = driver.manage().window().getSize();
			int height = dim.getHeight();
			int width  = dim.getWidth();
			
			int y = height/2;
			int x_right = (int)(width * 0.8);
		    int x_left  = (int)(width * 0.2);
			
		    action.press(ElementOption.point(x_right,y))
			      .waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000)))
			      .moveTo(ElementOption.point(x_left, y))
			      .release()
			      .perform();
		    
		    logger.log(Level.INFO, "Swiping Right to Left"); 
			
		}
		
		//Swipe from top to bottom
		Dimension dim = driver.manage().window().getSize();
        int height = dim.getHeight();
        int width = dim.getWidth();
        int x = width / 2;
        int top_y = (int) (height * 0.90);
        int bottom_y = (int) (height * 0.05);
		
        action.press(ElementOption.point(x,top_y))
	      .waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000)))
	      .moveTo(ElementOption.point(x,bottom_y))
	      .release()
	      .perform();
		
        logger.log(Level.INFO, "Swiping Down"); 
		
	}
	
	
	@AfterMethod
	public void TearDown() {
		System.out.println("Current Activity is-"+driver.currentActivity());
		driver.quit();	
	}
	
}
