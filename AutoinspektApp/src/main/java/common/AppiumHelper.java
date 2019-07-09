package common;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.Create2WLead;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AppiumHelper {
	public static int Imagecount;
	protected static Create2WLead PI2W= new Create2WLead();
	private static WebElement Element = null;
	public static WebElement FindElementById(AndroidDriver<MobileElement> driver,String ID) {
		Element=driver.findElementById(ID);
		return Element;
	}
	public static WebElement FindElementByXpath(AndroidDriver<MobileElement> driver,String Xpath) {
		Element=driver.findElementByXPath(Xpath);
		return Element;
	}
	
	public static WebElement FindElementByAccesabilityID(AndroidDriver<MobileElement> driver,String ID) {
		Element=driver.findElementByAccessibilityId(ID);
		return Element;
	}
	public void clickOnElementByXpath(AndroidDriver<MobileElement> driver,String Xpath) {
		AppiumHelper.FindElementByXpath(driver, Xpath).click();
		
	}
    public void clickOnElementByID(AndroidDriver<MobileElement> driver,String ID) throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	AppiumHelper.FindElementById(driver, ID).click();
		}
    public void clickOnElementByAccessabilityID(AndroidDriver<MobileElement> driver,String ID) {
    	AppiumHelper.FindElementByAccesabilityID(driver,ID).click();
    	}
    
   public void SendkeysById(AndroidDriver<MobileElement> driver,String ID,String Input) {
	AppiumHelper.FindElementById(driver, ID).sendKeys(Input);
	
}
   public void SendkeysByXpath(AndroidDriver<MobileElement> driver,String Xpath,String Input) {
	AppiumHelper.FindElementById(driver, Xpath).sendKeys(Input);
}
   public void ScrollToViewElement(AndroidDriver<MobileElement> driver,String element) throws InterruptedException {
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	   driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+element+"\"));");
	     }
   
   public void ScrollToPerticularElement(AndroidDriver<MobileElement> driver,String element) {
	   MobileElement radioGroup = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"+ ".resourceId(\"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/recycler_view_myJob\")).scrollIntoView("+ "new UiSelector().text(\"" + element +"\"));");
   }
   public void ScrollInMainPage(AndroidDriver<MobileElement> driver) {
	   (new TouchAction(driver))
       .press(PointOption.point(535, 1702)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
       .moveTo(PointOption.point(474, 642)).release().perform();
   }
public void GetToastMessage(AndroidDriver<MobileElement> driver) {
	WebElement ToastView = driver.findElementByXPath("//android.widget.Toast[1]");
    String ToastMessage = ToastView.getAttribute("name");
    System.out.println("Toast Message Displayed as : "+ToastMessage);
     if(ToastMessage.equalsIgnoreCase("Please Fix the Appointment First")) {
    	  System.out.println("Toast Message validation done");
      }
      else {
    	  System.out.println("Toast Message validation Not Done");
      }
}
public void IsToastMessageDisplayed(AndroidDriver<MobileElement> driver) {
	WebElement ToastView = driver.findElementByXPath("//android.widget.Toast[1]");
	if(ToastView.isDisplayed()) {
		
	}
}
public void login(AndroidDriver<MobileElement> driver,String UserName, String Password) throws InterruptedException {
	
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	this.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etUsername");
	this.SendkeysById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etUsername", UserName);
	this.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etPassword");
	this.SendkeysById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etPassword", Password);
	this.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/btlogin");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

public void ClickOnValuateNow(AndroidDriver<MobileElement> driver,String RegNo) throws InterruptedException, IOException {
	if(this.FindElementById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/swipeRefreshLayout").isDisplayed()) {
		this.ScrollToPerticularElement(driver, RegNo);
		int count=driver.findElementsById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRegNo").size();
        System.out.println(count);
	    for(int i=0;i<count;i++)

	    {
         String text=driver.findElementsById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRegNo").get(i).getText();
	    //System.out.println("reg"+RegNo);
	   // System.out.println(text);
	    if(text.equalsIgnoreCase(RegNo))
	    {
	  //  System.out.println(2);
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    this.TakeScreenShot(driver, "PI2wAddedLead");
	   // System.out.println( "Inspect Count : " +driver.findElementsById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butValuateNow").size());
	    driver.findElementsById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butValuateNow").get(i).click();
	    
	/*driver.findElementsById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butValuateNow").get(i).click();*/
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	break;}
	    }
		
		
	/*	
		if(driver.findElementById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRegNo").getText().equals(RegNo)) {
		this.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butValuateNow");
		//this.GetToastMessage(driver);
		//helper.clickOnElementByID(driver, Appointment);
		//PI2W.Submit(driver);
*/		
		 		/*}else {System.out.println("Added Job not existed in my job list");}	*/			
	}else {System.out.println("After click On Submit it didnt redirect to My Jobs Screen / job is not created");
	}
}

public void CaptureImagesUsingContinousCamera(AndroidDriver<MobileElement> driver) throws InterruptedException {
	try {
		Imagecount=0;
		WebDriverWait wait = new WebDriverWait(driver, 62);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/cameraBoxi4w")));
		
		this.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/cameraBoxi4w");
	while(driver.findElementById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/btnCapture").isDisplayed()) {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		this.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/btnCapture");
		Imagecount++;
	}
	
	}
	catch(Exception e) {
		
	}
	System.out.println("Image Count :"+Imagecount);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println(AppiumHelper.FindElementById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/buttonSteponeNext").getText());
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	this.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/buttonSteponeNext");
	//this.clickOnElementByXpath(driver, "//android.widget.TextView[@text='Next']");
	
}
public void TakeScreenShot(AndroidDriver<MobileElement> driver,String FileName) throws IOException{
File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scrFile,new File(BaseClass.Screenshotfolder + FileName +".png"));
}

}
