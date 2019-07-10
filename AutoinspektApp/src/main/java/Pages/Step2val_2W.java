package Pages;

import org.openqa.selenium.NoSuchElementException;

import common.AppiumHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Step2val_2W {
	protected static AppiumHelper helper = new AppiumHelper();

	public void InsuredName(AndroidDriver<MobileElement> driver) {
		if ((AppiumHelper.FindElementById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etInsNamei2w")
				.getText()).isEmpty()) {
			System.out.println("Insured Name  is not prefilled");
			AppiumHelper.FindElementById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etInsNamei2w")
					.sendKeys("kjdsjkgdj");
		} else {
			System.out.println("Insured Name is prefilled as : " + AppiumHelper
					.FindElementById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etInsNamei2w")
					.getText());
		}

	}

	public void InsuredAddress(AndroidDriver<MobileElement> driver, String InsuredAddress) {

		helper.SendkeysById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etInsAddri2w", InsuredAddress);
	}

	public void InsuredMobileNo(AndroidDriver<MobileElement> driver) {

		if ((AppiumHelper.FindElementById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etInsMbi2w")
				.getText()).isEmpty()) {
			System.out.println("Insured Mob No is not prefilled");
			AppiumHelper.FindElementById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etInsMbi2w")
					.sendKeys("7777777777");
		} else {
			System.out.println("Insured Mob No is prefilled as : " + AppiumHelper
					.FindElementById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etInsMbi2w").getText());
		}

	}

	public void vehRegNo(AndroidDriver<MobileElement> driver) {

		if ((AppiumHelper.FindElementById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etRegNoi2w")
				.getText()).isEmpty()) {
			System.out.println("Insured Mob No is not prefilled");
			AppiumHelper.FindElementById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etRegNoi2w")
					.sendKeys("RegNo123");
		} else {
			System.out.println("RegNo is prefilled as : " + AppiumHelper
					.FindElementById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etRegNoi2w").getText());
		}
	}

	public void EngineNo(AndroidDriver<MobileElement> driver, String EngNumber) {
		helper.SendkeysById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etEngineNoi2w", EngNumber);
	}

	public void ChassisNo(AndroidDriver<MobileElement> driver, String ChassisNumber) {
		helper.SendkeysById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etChassisNoi2w", ChassisNumber);
	}

	public void SelectManufacturer(AndroidDriver<MobileElement> driver, String Make) throws InterruptedException {
		helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvManufi2w");
		helper.ScrollToViewElement(driver, Make);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Make + "']");
	}

	public void SelectModel(AndroidDriver<MobileElement> driver, String Model) throws InterruptedException {

		helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvModeli2w");
		helper.ScrollToViewElement(driver, Model);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Model + "']");
	}

	public void SelectVariant(AndroidDriver<MobileElement> driver, String Variant) throws InterruptedException {

		helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvVariant");
		helper.ScrollToViewElement(driver, Variant);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Variant + "']");
	}

	/*
	 * MobileElement el13 = (MobileElement) driver.findElementByXPath(
	 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout[2]"
	 * ); el13.click();
	 */
	public void SelectmanfacturingYear(AndroidDriver<MobileElement> driver, String ManfactureYear) throws InterruptedException {
		helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvYOMi2w");
		helper.ScrollToViewElement(driver,ManfactureYear);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+ManfactureYear+"']");
	}

	public void EnterSurveyLocation(AndroidDriver<MobileElement> driver, String Location) {
		try{
		helper.SendkeysById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etLoci2w", Location);}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.SendkeysById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etLoci2w", Location);
		}
	}

	public void OdometerReading(AndroidDriver<MobileElement> driver, String Odometer) {
try {
		helper.SendkeysById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etOdoMtr", Odometer);}
catch(NoSuchElementException e) {
	helper.ScrollInMainPage(driver);
	helper.SendkeysById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etOdoMtr", Odometer);
		}
	}

	public void EnterExtraKMS(AndroidDriver<MobileElement> driver, String ExtraKms) {
		helper.SendkeysById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etEkmi2w", ExtraKms);
	}

	public void InspectionType(AndroidDriver<MobileElement> driver, String InspectionType) throws InterruptedException {
		helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvIspTypei2w");

		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + InspectionType + "']");
	}

	public void paymentmode(AndroidDriver<MobileElement> driver) {
		if (AppiumHelper.FindElementById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvPayModei2w")
				.isSelected()) {
			System.out.println("payment Mode already selected as " + AppiumHelper
					.FindElementById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvPayModei2w")
					.getText());
		}
	}

	/*
	 * MobileElement el20 = (MobileElement) driver.findElementById(
	 * "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvPayModei2w");
	 * el20.click(); MobileElement el21 = (MobileElement) driver.findElementById(
	 * "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etFeesAmount");
	 * el21.click(); MobileElement el22 = (MobileElement) driver.findElementById(
	 * "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etConveyanceAllowance");
	 * el22.click(); MobileElement el23 = (MobileElement) driver.findElementById(
	 * "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etCashToColi2w");
	 * el23.click();
	 */
	public void ClickOnNext(AndroidDriver<MobileElement> driver) {
		MobileElement el24 = (MobileElement) driver
				.findElementById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/btNexti2w");
		el24.click();
		
		
	}

}
