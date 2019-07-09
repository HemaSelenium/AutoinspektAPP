package Pages;

import java.io.IOException;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import common.AppiumHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class Step4val_2W {
protected static AppiumHelper helper = new AppiumHelper();
	
	public void Status(AndroidDriver<MobileElement> driver,String Status) throws InterruptedException{
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvStatusi2w");
		helper.ScrollToViewElement(driver, Status);
		//Not Recommended
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+Status+"']");
	}
	
	public void CouponDelivery(AndroidDriver<MobileElement> driver,String CouponDelivery) throws InterruptedException{
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvCDeli2w");
		helper.ScrollToViewElement(driver, CouponDelivery);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+CouponDelivery+"']");
	}
	public void Remark(AndroidDriver<MobileElement> driver,String Remark) throws InterruptedException{
		
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etRemi2w");
		helper.SendkeysById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etRemi2w", Remark);
		
	}
	public void ClickOnNext(AndroidDriver<MobileElement> driver) throws InterruptedException {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/btSubmiti2w");
	}
	public void Declaration(AndroidDriver<MobileElement> driver) throws InterruptedException{
		helper.clickOnElementByID(driver, "android:id/button1");}
	
public void Signature(AndroidDriver<MobileElement> driver) throws InterruptedException, IOException {
	
	Actions builder = new Actions(driver);
	
	Action drawAction = builder.moveToElement(AppiumHelper.FindElementById(driver, "cordova.signature-view:pad"), 20, 20)
		.clickAndHold()
		.moveByOffset(80, 80)
		.moveByOffset(50, 20)
		.release()
		.build();
	drawAction.perform();
		helper.TakeScreenShot(driver, "Signature");
	helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/ok");
	
}

}
