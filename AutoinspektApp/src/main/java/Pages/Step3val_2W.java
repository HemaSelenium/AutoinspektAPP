package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;

import common.AppiumHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Step3val_2W {
	protected static AppiumHelper helper = new AppiumHelper();
	
	public void HeadLamp(AndroidDriver<MobileElement> driver,String HeadLampCondition) throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvHeadLmpi2w");
		helper.ScrollToViewElement(driver, HeadLampCondition);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+HeadLampCondition+"']");
	}
	
	public void FrontLeftIndicatorLight(AndroidDriver<MobileElement> driver,String FrontLeftIndicatorLight) throws InterruptedException{
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvFLIndi2w");
		helper.ScrollToViewElement(driver, FrontLeftIndicatorLight);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+FrontLeftIndicatorLight+"']");}
catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvFLIndi2w");
			helper.ScrollToViewElement(driver, FrontLeftIndicatorLight);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+FrontLeftIndicatorLight+"']");
		}
	}
	public void FrontRightIndicatorLight(AndroidDriver<MobileElement> driver,String FrontRightIndicatorLight) throws InterruptedException{
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvFRIndi2w");
		helper.ScrollToViewElement(driver, FrontRightIndicatorLight);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+FrontRightIndicatorLight+"']");}
       catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvFRIndi2w");
			helper.ScrollToViewElement(driver, FrontRightIndicatorLight);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+FrontRightIndicatorLight+"']");
		}
	}
	public void FrontMudguard(AndroidDriver<MobileElement> driver,String FrontMudguard) throws InterruptedException{
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvFMudi2w");
		helper.ScrollToViewElement(driver, FrontMudguard);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+FrontMudguard+"']");}
		
catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvFMudi2w");
			helper.ScrollToViewElement(driver, FrontMudguard);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+FrontMudguard+"']");
		}
	}
	public void Speedometer(AndroidDriver<MobileElement> driver,String Speedometer) throws InterruptedException{
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvSpeedomtri2w");
		helper.ScrollToViewElement(driver, Speedometer);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+Speedometer+"']");}
     catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvSpeedomtri2w");
			helper.ScrollToViewElement(driver, Speedometer);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+Speedometer+"']");
		}
	}
	public void Handle(AndroidDriver<MobileElement> driver,String Handle) throws InterruptedException{
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvHandlei2w");
		helper.ScrollToViewElement(driver, Handle);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+Handle+"']");}
catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvHandlei2w");
			helper.ScrollToViewElement(driver, Handle);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+Handle+"']");
		}
	}
	public void LeverClutch(AndroidDriver<MobileElement> driver,String LeverClutch) throws InterruptedException{
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvLvrCthi2w");
		helper.ScrollToViewElement(driver, LeverClutch);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+LeverClutch+"']");}
catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvLvrCthi2w");
			helper.ScrollToViewElement(driver, LeverClutch);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+LeverClutch+"']");
		}
	}
	public void FrontHub(AndroidDriver<MobileElement> driver,String FrontHub) throws InterruptedException{
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvFtHubi2w");
		helper.ScrollToViewElement(driver, FrontHub);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+FrontHub+"']");}
catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvFtHubi2w");
			helper.ScrollToViewElement(driver, FrontHub);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+FrontHub+"']");
		}
	}
	public void FrontWheelRim(AndroidDriver<MobileElement> driver,String FrontWheelRim) throws InterruptedException{
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvFWheelRimi2w");
		helper.ScrollToViewElement(driver, FrontWheelRim);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+FrontWheelRim+"']");}
catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvFWheelRimi2w");
			helper.ScrollToViewElement(driver, FrontWheelRim);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+FrontWheelRim+"']");
		}
	}
	public void FrontShockAbsorber(AndroidDriver<MobileElement> driver,String FrontShockAbsorber) throws InterruptedException{
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvFtShockAbri2w");
		helper.ScrollToViewElement(driver, FrontShockAbsorber);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+FrontShockAbsorber+"']");}
catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvFtShockAbri2w");
			helper.ScrollToViewElement(driver, FrontShockAbsorber);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+FrontShockAbsorber+"']");
		}
	}
	public void LegGuard(AndroidDriver<MobileElement> driver,String LegGuard) throws InterruptedException{
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvHeadLmpi2w");
		helper.ScrollToViewElement(driver, LegGuard);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+LegGuard+"']");}
		catch(NoSuchElementException e) {
			
		}
	}
	public void LeftCover(AndroidDriver<MobileElement> driver,String LeftCover) throws InterruptedException{
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvLCoveri2w");
		helper.ScrollToViewElement(driver, LeftCover);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+LeftCover+"']");
		}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvLCoveri2w");
			helper.ScrollToViewElement(driver, LeftCover);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+LeftCover+"']");
		}
	}
	public void RightCover(AndroidDriver<MobileElement> driver,String RightCover) throws InterruptedException{
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRcoveri2w");
		helper.ScrollToViewElement(driver, RightCover);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+RightCover+"']");}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRcoveri2w");
			helper.ScrollToViewElement(driver, RightCover);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+RightCover+"']");
		}
	}
	public void ChassisFrame(AndroidDriver<MobileElement> driver,String ChassisFrame) throws InterruptedException{
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvCframei2w");
		helper.ScrollToViewElement(driver, ChassisFrame);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" +ChassisFrame+"']");}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvCframei2w");
			helper.ScrollToViewElement(driver, ChassisFrame);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" +ChassisFrame+"']");
		}
	}
	public void CrankCase(AndroidDriver<MobileElement> driver,String CrankCase) throws InterruptedException{
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvCrankCi2w");
		helper.ScrollToViewElement(driver, CrankCase);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+CrankCase+"']");}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvCrankCi2w");
			helper.ScrollToViewElement(driver, CrankCase);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+CrankCase+"']");
		}
	}
	public void RearWheelRim(AndroidDriver<MobileElement> driver,String RearWheelRim) throws InterruptedException{
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRearWRimi2w");
		helper.ScrollToViewElement(driver, RearWheelRim);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+RearWheelRim+"']");}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRearWRimi2w");
			helper.ScrollToViewElement(driver, RearWheelRim);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+RearWheelRim+"']");
		}
	}
	public void RearShockAbsorber(AndroidDriver<MobileElement> driver,String RearShockAbsorber) throws InterruptedException{
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRearShockAbri2w");
		helper.ScrollToViewElement(driver, RearShockAbsorber);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+RearShockAbsorber+"']");}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRearShockAbri2w");
			helper.ScrollToViewElement(driver, RearShockAbsorber);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+RearShockAbsorber+"']");
			
		}
	}
	public void RearDrumDisc(AndroidDriver<MobileElement> driver,String RearDrumDisc) throws InterruptedException{
		try {
			
		
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRDrumi2w");
		helper.ScrollToViewElement(driver, RearDrumDisc);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+RearDrumDisc+"']");}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRDrumi2w");
			helper.ScrollToViewElement(driver, RearDrumDisc);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+RearDrumDisc+"']");
		}
	}
	
	public void TailLamp(AndroidDriver<MobileElement> driver,String TailLamp) throws InterruptedException{
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvTLi2w");
		helper.ScrollToViewElement(driver, TailLamp);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+TailLamp+"']");}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvTLi2w");
			helper.ScrollToViewElement(driver, TailLamp);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+TailLamp+"']");
		}
	}
	public void RearLeftIndicatorLight(AndroidDriver<MobileElement> driver,String RearLeftIndicatorLight) throws InterruptedException{
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRLIndi2w");
		helper.ScrollToViewElement(driver, RearLeftIndicatorLight);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+RearLeftIndicatorLight+"']");}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRLIndi2w");
			helper.ScrollToViewElement(driver, RearLeftIndicatorLight);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+RearLeftIndicatorLight+"']");
			
		}
	}
	public void RearRightIndicatorLight(AndroidDriver<MobileElement> driver,String RearRightIndicatorLight) throws InterruptedException{
		
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRRIndi2w");
		helper.ScrollToViewElement(driver, RearRightIndicatorLight);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+RearRightIndicatorLight+"']");}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRRIndi2w");
			helper.ScrollToViewElement(driver, RearRightIndicatorLight);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+RearRightIndicatorLight+"']");
		}
	}
	public void ChainCover(AndroidDriver<MobileElement> driver,String ChainCover) throws InterruptedException{
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvChainCi2w");
		helper.ScrollToViewElement(driver, ChainCover);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+ChainCover +"']");}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvChainCi2w");
			helper.ScrollToViewElement(driver, ChainCover);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+ChainCover +"']");
		}
	}
	public void Seats(AndroidDriver<MobileElement> driver,String Seats) throws InterruptedException{
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvSEATSi2w");
		helper.ScrollToViewElement(driver, Seats);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+Seats+"']");
	}
	public void RearViewMirror(AndroidDriver<MobileElement> driver,String RearViewMirror) throws InterruptedException{
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRVMLi2w");
		helper.ScrollToViewElement(driver, RearViewMirror);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+RearViewMirror+"']");
	}
	public void RearViewMirrorRT(AndroidDriver<MobileElement> driver,String RearViewMirrorRT) throws InterruptedException{
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRVMRi2w");
		helper.ScrollToViewElement(driver, RearViewMirrorRT);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+RearViewMirrorRT+"']");
	}
	public void Fork(AndroidDriver<MobileElement> driver,String Fork) throws InterruptedException{
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvFORKi2w");
		helper.ScrollToViewElement(driver, Fork);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+Fork+"']");
	}
	public void KickPedal(AndroidDriver<MobileElement> driver,String KickPedal) throws InterruptedException{
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvKickPi2w");
		helper.ScrollToViewElement(driver, KickPedal);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+KickPedal+"']");}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvKickPi2w");
			helper.ScrollToViewElement(driver, KickPedal);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+KickPedal+"']");
			
		}
	}
	
	
	
	public void RearCowlLeft (AndroidDriver<MobileElement> driver,String RearCowlLeft) throws InterruptedException{
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRearCLi2w");
		helper.ScrollToViewElement(driver, RearCowlLeft);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+RearCowlLeft+"']");}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRearCLi2w");
			helper.ScrollToViewElement(driver, RearCowlLeft);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+RearCowlLeft+"']");
			
		}
	}
	public void LegShieldLeft(AndroidDriver<MobileElement> driver,String LegShieldLeft) throws InterruptedException{
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvLegSLi2w");
		helper.ScrollToViewElement(driver, LegShieldLeft);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+LegShieldLeft+"']");}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvLegSLi2w");
			helper.ScrollToViewElement(driver, LegShieldLeft);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+LegShieldLeft+"']");
			
		}
	}
	public void LegShieldRight(AndroidDriver<MobileElement> driver,String LegShieldRight) throws InterruptedException{
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvLegSRi2w");
		helper.ScrollToViewElement(driver, LegShieldRight);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+LegShieldRight+"']");}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvLegSRi2w");
			helper.ScrollToViewElement(driver, LegShieldRight);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+LegShieldRight+"']");
		}
	}
	public void Fairing(AndroidDriver<MobileElement> driver,String Fairing) throws InterruptedException {
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvFAIRINGi2w");
		helper.ScrollToViewElement(driver, Fairing);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+Fairing+"']");}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvFAIRINGi2w");
			helper.ScrollToViewElement(driver, Fairing);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+Fairing+"']");
		}
	}
	public void RearMudguard(AndroidDriver<MobileElement> driver,String RearMudguard) throws InterruptedException {
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvReMudi2w");
		helper.ScrollToViewElement(driver, RearMudguard);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+RearMudguard+"']");}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvReMudi2w");
			helper.ScrollToViewElement(driver, RearMudguard);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+RearMudguard+"']");
		}
	}
	public void SareeGuard(AndroidDriver<MobileElement> driver,String SareeGuard) throws InterruptedException {
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvSGRDi2w");
		helper.ScrollToViewElement(driver, SareeGuard);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+SareeGuard+"']");}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvSGRDi2w");
			helper.ScrollToViewElement(driver, SareeGuard);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+SareeGuard+"']");
			
		}
	}
	public void Wisor(AndroidDriver<MobileElement> driver,String Wisor) throws InterruptedException {
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvWISORi2w");
		helper.ScrollToViewElement(driver, Wisor);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+Wisor+"']");}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvWISORi2w");
			helper.ScrollToViewElement(driver, Wisor);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+Wisor+"']");}
	}
	public void Stepney(AndroidDriver<MobileElement> driver,String Stepney) throws InterruptedException {
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvSTEPENYi2w");
		helper.ScrollToViewElement(driver, Stepney);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+Stepney+"']");}
		
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			Thread.sleep(2000);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvSTEPENYi2w");
			helper.ScrollToViewElement(driver, Stepney);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+Stepney+"']");}
	}
	public void StepneyBracket(AndroidDriver<MobileElement> driver,String StepneyBracket) throws InterruptedException {
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvSTEPENYBi2w");
		helper.ScrollToViewElement(driver, StepneyBracket);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+StepneyBracket+"']");}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvSTEPENYBi2w");
			helper.ScrollToViewElement(driver, StepneyBracket);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+StepneyBracket+"']");}
	}
	public void RearFootrest(AndroidDriver<MobileElement> driver,String RearFootrest) throws InterruptedException {
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRFFi2w");
		helper.ScrollToViewElement(driver, RearFootrest);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+RearFootrest+"']");}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRFFi2w");
			helper.ScrollToViewElement(driver, RearFootrest);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+RearFootrest+"']");}
	}
	public void HelmetBox(AndroidDriver<MobileElement> driver,String HelmetBox) throws InterruptedException {
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvHBi2w");
		helper.ScrollToViewElement(driver, HelmetBox);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+HelmetBox+"']");}
	catch(NoSuchElementException e) {
		helper.ScrollInMainPage(driver);
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvHBi2w");
		helper.ScrollToViewElement(driver, HelmetBox);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+HelmetBox+"']");}
	}
	
	public void TyresFront(AndroidDriver<MobileElement> driver,String TyresFront) throws InterruptedException {
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvTFRi2w");
		helper.ScrollToViewElement(driver, TyresFront);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+TyresFront+"']");}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvTFRi2w");
			helper.ScrollToViewElement(driver, TyresFront);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+TyresFront+"']");
		}
	}
	
	public void LuggageCarrier(AndroidDriver<MobileElement> driver,String LuggageCarrier) throws InterruptedException {
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvLCi2w");
		helper.ScrollToViewElement(driver, LuggageCarrier);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+LuggageCarrier+"']");}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvLCi2w");
			helper.ScrollToViewElement(driver, LuggageCarrier);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+LuggageCarrier+"']");
		}
	}
	
	public void FuelTank(AndroidDriver<MobileElement> driver,String FuelTank) throws InterruptedException {
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvfuel_tanki2w");
		helper.ScrollToViewElement(driver, FuelTank);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+FuelTank+"']");}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvfuel_tanki2w");
			helper.ScrollToViewElement(driver, FuelTank);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+FuelTank+"']");
		}
	}
	
	public void Silencer(AndroidDriver<MobileElement> driver,String Silencer) throws InterruptedException {
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvsilenceri2w");
		helper.ScrollToViewElement(driver, Silencer);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+Silencer+"']");}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvsilenceri2w");
			helper.ScrollToViewElement(driver, Silencer);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+Silencer+"']");
		}
	}
	
	public void RcVerified(AndroidDriver<MobileElement> driver,String RcVerified) throws InterruptedException {
		try {
		helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRcVerifiedi4w");
		helper.ScrollToViewElement(driver, RcVerified);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+RcVerified+"']");}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver,"co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvRcVerifiedi4w");
			helper.ScrollToViewElement(driver, RcVerified);
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+RcVerified+"']");
		}
	}
	
	
	
	
	public void VehicleLocated(AndroidDriver<MobileElement> driver,String VehLocation) throws InterruptedException {
		try {
		helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/vehLoc");
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + VehLocation + "']");}
		
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/vehLoc");
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + VehLocation + "']");
		}
	}
	public void MarketValue(AndroidDriver<MobileElement> driver,String Marketvalue) {
		try {
		helper.SendkeysById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etMarketVal", Marketvalue);}
		
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			helper.SendkeysById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etMarketVal", Marketvalue);
		}
	}
	public void isVehicleFittedWithCngORlpg(AndroidDriver<MobileElement> driver,String VehicleFIttedWithCNGorLPG) throws InterruptedException{
		try {
		if(VehicleFIttedWithCNGorLPG.equalsIgnoreCase("Yes")) {
			helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butcngIns2W1");
		}else{
			helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butcngIns2W2");
		}	}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			if(VehicleFIttedWithCNGorLPG.equalsIgnoreCase("Yes")) {
				helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butcngIns2W1");
			}else{
				helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butcngIns2W2");
			}
		}
		
	}
	public void CngORlpgendorsedonRC(AndroidDriver<MobileElement> driver,String EndorsomentOnRC) throws InterruptedException{
		try {
		if(EndorsomentOnRC.equalsIgnoreCase("Yes")) {
			helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butCngRcIns2W1");
		}else if(EndorsomentOnRC.equalsIgnoreCase("NO")){
			
			helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butCngRcIns2W2");
		}	
		else {
			helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butCngRcIns2W3");
		}
		}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			if(EndorsomentOnRC.equalsIgnoreCase("Yes")) {
				helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butCngRcIns2W1");
			}else if(EndorsomentOnRC.equalsIgnoreCase("NO")){
				
				helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butCngRcIns2W2");
			}	
			else {
				helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butCngRcIns2W3");
			}
			
		}
	}
	
	public void FrontNumberplate(AndroidDriver<MobileElement> driver,String FrontNumberPlate) throws InterruptedException{
		try {
		if(FrontNumberPlate.equalsIgnoreCase("Yes")) {
			helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butFnoPIns2W1");
		}else if(FrontNumberPlate.equalsIgnoreCase("NO")){
			helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butFnoPIns2W2");
		}	else if(FrontNumberPlate.equalsIgnoreCase("Handwritten")) {
			helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butFnoPIns2W3");
		}else if(FrontNumberPlate.equalsIgnoreCase("Mismatch")) {
			helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butFnoPIns2W4");
			
		}else {
			helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butFnoPIns2W5");
		}}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			if(FrontNumberPlate.equalsIgnoreCase("Yes")) {
				helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butFnoPIns2W1");
			}else if(FrontNumberPlate.equalsIgnoreCase("NO")){
				helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butFnoPIns2W2");
			}	else if(FrontNumberPlate.equalsIgnoreCase("Handwritten")) {
				helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butFnoPIns2W3");
			}else if(FrontNumberPlate.equalsIgnoreCase("Mismatch")) {
				helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butFnoPIns2W4");
				
			}else {
				helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butFnoPIns2W5");
			}
		}
		
	}
	public void RearNumberplate(AndroidDriver<MobileElement> driver,String RearNumberplate) throws InterruptedException{
		try {
		if(RearNumberplate.equalsIgnoreCase("Yes")) {
			helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butRnoPIns2W1");
		}else if(RearNumberplate.equalsIgnoreCase("NO")){
			helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butRnoPIns2W2");
		}	else if(RearNumberplate.equalsIgnoreCase("Handwritten")) {
			helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butRnoPIns2W3");
		}else if(RearNumberplate.equalsIgnoreCase("Mismatch")) {
			helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butRnoPIns2W4");
			
		}else {
			helper.clickOnElementByXpath(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butRnoPIns2W5");
		}
		}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			if(RearNumberplate.equalsIgnoreCase("Yes")) {
				helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butRnoPIns2W1");
			}else if(RearNumberplate.equalsIgnoreCase("NO")){
				helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butRnoPIns2W2");
			}	else if(RearNumberplate.equalsIgnoreCase("Handwritten")) {
				helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butRnoPIns2W3");
			}else if(RearNumberplate.equalsIgnoreCase("Mismatch")) {
				helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butRnoPIns2W4");
				
			}else {
				helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butRnoPIns2W5");
			}
		}
	}
	public void Clientcooperation(AndroidDriver<MobileElement> driver,String Clientcooperation) throws InterruptedException{
		try {
		if(Clientcooperation.equalsIgnoreCase("Yes")) {
			helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butccoIns2W1");
		}else{
			helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butccoIns2W2");
		}	}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			if(Clientcooperation.equalsIgnoreCase("Yes")) {
				helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butccoIns2W1");
			}else{
				helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butccoIns2W2");
			}	
		}
		
	}
	public void VehicleKey(AndroidDriver<MobileElement> driver,String VehicleKey) throws InterruptedException{
		try {
		if(VehicleKey.equalsIgnoreCase("Yes")) {
			helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butvkIns2W1");
		}else{
			helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butvkIns2W2");
		}	}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			if(VehicleKey.equalsIgnoreCase("Yes")) {
				helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butvkIns2W1");
			}else{
				helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butvkIns2W2");
			}	
			
			
		}
		
	}
	
	
	public void Startthevehicle(AndroidDriver<MobileElement> driver,String Startthevehicle) throws InterruptedException{
		try {
		if(Startthevehicle.equalsIgnoreCase("Yes")) {
			helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butsvIns2W1");
		}else{
			helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butsvIns2W2");
		}	}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			if(Startthevehicle.equalsIgnoreCase("Yes")) {
				helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butsvIns2W1");
			}else{
				helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butsvIns2W2");
			}				
			
			
		}
		
	}
	public void ChassisNoonvehicle(AndroidDriver<MobileElement> driver,String ChassisNoonvehicle) throws InterruptedException{
		try {
		if(ChassisNoonvehicle.equalsIgnoreCase("Yes")) {
			helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butcnoIns2W1");
		}else{
			helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butcnoIns2W2");
		}	}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			if(ChassisNoonvehicle.equalsIgnoreCase("Yes")) {
				helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butcnoIns2W1");
			}else{
				helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/butcnoIns2W2");
			}
		}
		
	}
	public void ClickOnNextInstep3(AndroidDriver<MobileElement> driver) throws InterruptedException {
		try {
			
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/btNexti2w3");}
		catch(NoSuchElementException e) {
			helper.ScrollInMainPage(driver);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/btNexti2w3");
		}
	}
}
