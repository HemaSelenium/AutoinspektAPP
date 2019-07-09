package Pages;

import common.AppiumHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class Step2val_4W {
	protected static AppiumHelper helper=new AppiumHelper();
	
	
	
	public void InsuredName(AndroidDriver<MobileElement> driver) {
		MobileElement el1 = (MobileElement) driver.findElementById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etInsNamei4w");
		el1.sendKeys("InsuredNmae");
	}
	public void InsuredAddress1(AndroidDriver<MobileElement> driver) {
		MobileElement el2 = (MobileElement) driver.findElementById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etInsAddri4w");
		el2.sendKeys("Insured Address");
	}
	
	public void InsuredMobile(AndroidDriver<MobileElement> driver) {
	MobileElement el3 = (MobileElement) driver.findElementById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etInsMbi4w");
	el3.sendKeys("8888888888");
	}
	public void VehRegNumber(AndroidDriver<MobileElement> driver) {
	MobileElement el4 = (MobileElement) driver.findElementById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etRegNoi4w");
	el4.click();
	}
	public void EngineNumber(AndroidDriver<MobileElement> driver) {
	MobileElement el5 = (MobileElement) driver.findElementById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etEngineNoi4w");
	el5.sendKeys("EngineNUmber");
	}
	public void ChassisNumber(AndroidDriver<MobileElement> driver) {
	MobileElement el6 = (MobileElement) driver.findElementById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etChassisNoi4w");
	el6.sendKeys("ChassisNumber");
	}
	public void SelectManfacturer(AndroidDriver<MobileElement> driver) {
	MobileElement el7 = (MobileElement) driver.findElementById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvManufi4w");
	el7.click();
	//MAHINDRA
	MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[5]");
	el8.click();
	}
	public void SelectModel(AndroidDriver<MobileElement> driver) {
	MobileElement el9 = (MobileElement) driver.findElementById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvModeli4w");
	el9.click();
	//GUSTO
	MobileElement el10 = (MobileElement) driver.findElementById("android:id/text1");
	el10.click();
	}
	public void SelectVariant(AndroidDriver<MobileElement> driver) {

	MobileElement el11 = (MobileElement) driver.findElementById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvVariant");
	el11.click();
	//VK 110
	MobileElement el12 = (MobileElement) driver.findElementById("android:id/text1");
	el12.click();}
	public void ManufacturingYear(AndroidDriver<MobileElement> driver) {
	MobileElement el13 = (MobileElement) driver.findElementById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvYOMi4w");
	el13.click();
	//2017
	MobileElement el14 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[12]");
	el14.click();
	}
	public void SelectLocation(AndroidDriver<MobileElement> driver) {
		MobileElement el17 = (MobileElement) driver.findElementById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etLoci4w");
		el17.click();
		el17.sendKeys("Survey Location");
		}
	/*public void SelectColour(AndroidDriver<MobileElement> driver) {
	MobileElement el15 = (MobileElement) driver.findElementById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvColor");
	el15.click();
	MobileElement el16 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[5]");
	el16.click();
	}*/
	
	public void EnterOdometerReading(AndroidDriver<MobileElement> driver) {
	MobileElement el18 = (MobileElement) driver.findElementById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etOdoMtr");
	el18.sendKeys("290");
	}
	public void EnterExtraKMS(AndroidDriver<MobileElement> driver) {
	MobileElement el19 = (MobileElement) driver.findElementById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etEkmi4w");
	el19.sendKeys("290");
	}
	public void SelectInsType(AndroidDriver<MobileElement> driver) {
	MobileElement el20 = (MobileElement) driver.findElementById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvIspTypei4w");
	el20.click();
	MobileElement el21 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[1]");
	el21.click();
	}
	public void SelectPamentMode(AndroidDriver<MobileElement> driver) {
	MobileElement el22 = (MobileElement) driver.findElementById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvPayModei4w");
	el22.click();}
	public void FeeAmount(AndroidDriver<MobileElement> driver) {
	MobileElement el23 = (MobileElement) driver.findElementById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etFeesAmount");
	el23.click();}
	public void ConveAllowance(AndroidDriver<MobileElement> driver) {
	MobileElement el24 = (MobileElement) driver.findElementById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etConveyanceAllowance");
	el24.click();}
	public void CashToBecollected(AndroidDriver<MobileElement> driver) {
	MobileElement el25 = (MobileElement) driver.findElementById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etCashToColi4w");
	el25.click();}
	public void ClickOnNext(AndroidDriver<MobileElement> driver) {
	MobileElement el26 = (MobileElement) driver.findElementById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/btSubmitins4w");
	el26.click();
	}
	
}
