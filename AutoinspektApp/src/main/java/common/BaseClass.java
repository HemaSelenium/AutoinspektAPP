package common;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
/*import pages.MyJobs;
import pages.Retail2W;
import pages.Retail2WValuationStep3;
import pages.ValuationStep1;*/

public class BaseClass {
	protected static AndroidDriver<MobileElement> driver ;
	protected static AppiumHelper helper = new AppiumHelper();
	public static String Screenshotfolder="./src/ScreenShots";
	/*protected static ValuationStep1 Step1=new ValuationStep1();
	protected static Retail2W retail2w=new Retail2W();
	protected static MyJobs myJobs=new MyJobs();
	protected static Retail2WValuationStep3 Retail2WStep3=new Retail2WValuationStep3();*/
	//protected static AppiumHelper helper=new AppiumHelper();
	@BeforeClass
    public void setUp() throws MalformedURLException{
		/* File appDir = new File("src");
		 File app = new File(appDir, "ApiDemos-debug.apk");*/
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(CapabilityType.BROWSER_NAME,"");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		caps.setCapability(MobileCapabilityType.UDID, "3c5c437");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
		caps.setCapability("noReset", "true");
		caps.setCapability("unicodeKeyboard", "true");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "co.in.mfcwl.valuation.autoinspekt.autoinspekt");
		caps.setCapability("appActivity", "co.in.mfcwl.valuation.autoinspekt.autoinspekt.Splashscreen");
		caps.setCapability("autoGrantPermissions",true);
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		
		
	}
	
	
	@AfterClass
    public void tearDown() {
        driver.quit();
    }
}
