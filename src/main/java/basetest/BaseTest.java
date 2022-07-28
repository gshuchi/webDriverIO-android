package basetest;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {

	AndroidDriver<AndroidElement> driver;
	
	public AndroidDriver<AndroidElement> desiredcaps(){
		try {
			  DesiredCapabilities caps = new DesiredCapabilities();
			  caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			  caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
			  caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
			  caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
			  caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"\\src\\main\\resources\\app\\DemoApp-0.4.0.apk");
			  caps.setCapability(MobileCapabilityType.BROWSER_VERSION, "91.0");
			  caps.setCapability(AndroidMobileCapabilityType.AVD, "Pixel_4_XL");
			  //caps.setCapability(AndroidMobileCapabilityType.AVD_LAUNCH_TIMEOUT, "180000");
			  caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.wdiodemoapp");
			  caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.wdiodemoapp.MainActivity");
			  URL url = new URL("http://0.0.0.0:4723/wd/hub");
			  driver = new AndroidDriver<>(url,caps);
		   }catch(Exception e)
		    { 
			  e.printStackTrace(); 
		    }
	   System.out.println("App Launched Successfully");
	   return driver;
	}
}