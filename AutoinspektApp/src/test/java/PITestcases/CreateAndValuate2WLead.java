package PITestcases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;
import Pages.Create2WLead;
import Pages.Step2val_2W;
import Pages.Step3val_2W;
import Pages.Step4val_2W;
import common.BaseClass;
import common.DataProviders;
public class CreateAndValuate2WLead extends BaseClass{
		
	protected static Create2WLead PI2W= new Create2WLead();
	protected static Step2val_2W  Step2_2W= new Step2val_2W();
	protected static Step3val_2W Step3_2W=new Step3val_2W();
	protected static Step4val_2W Step4_2W=new Step4val_2W();
	@Test(priority=1,dataProvider="login",dataProviderClass=DataProviders.class)
	public void Login(String UserName, String Password) throws InterruptedException {
	helper.login(driver, UserName, Password);
	}
	
	@Test(priority=2,dataProvider="LeadCreate",dataProviderClass=DataProviders.class,dependsOnMethods={"Login"})
	public void Add2wLead(String AgentMobile,String EnterAgentCode,String	IntimatorNmae,String IntimatorEmail,String InsurereName,String DivisionName,String BranchNmae,String InsurereRefNo,String InsuredNmae,String InsuredMobileNO,String VehicleRegNo,String contactPersonMobNumber,String InspectionType,String VehicleType,String PaymentMode) throws InterruptedException, IOException {
	System.out.println("Testcase : Created 2W lead and do valuation");
		System.out.println("2W lead creation Started");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PI2W.ClickOnAddJob(driver);
			
	//	PI2W.ClickOnAddJob(driver);
		PI2W.EnterAgentMobileNumber(driver, AgentMobile);
		PI2W.EnterAgentCode(driver, EnterAgentCode);
		PI2W.IntimatorNmae(driver, IntimatorNmae);
		PI2W.IntimatorEmail(driver, IntimatorEmail);
		PI2W.InsurereName(driver, InsurereName);
		PI2W.DivisionName(driver, DivisionName);
		PI2W.BranchNmae(driver, BranchNmae);
		PI2W.InsurereRefNo(driver, InsurereRefNo);
		PI2W.InsuredNmae(driver, InsuredNmae);
		PI2W.InsuredMobileNO(driver, InsuredMobileNO);
		PI2W.VehicleRegNo(driver, VehicleRegNo);
		String RegNo=VehicleRegNo;
		PI2W.contactPersonMobNumber(driver, contactPersonMobNumber);
		PI2W.InspectionType(driver, InspectionType);
		PI2W.VehicleType(driver, VehicleType);
		PI2W.PaymentMode(driver, PaymentMode);
		PI2W.FeeAmount(driver);
		PI2W.ConveyanceCash(driver);
		PI2W.CashTobecollected(driver);
		PI2W.Submit(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//helper.ScrollToPerticularElement(driver, RegNo);
		helper.ClickOnValuateNow(driver, RegNo);
				
	}
	
	@Test(priority=3,dependsOnMethods={"Add2wLead"})
	public void Step1Valuation() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvVideo");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/btnCapture");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		helper.CaptureImagesUsingContinousCamera(driver);
		Thread.sleep(2000);
		
	}
	
	@Test(priority=4,dependsOnMethods={"Step1Valuation"},dataProvider="2WStep2",dataProviderClass=DataProviders.class)
	public void Step2Valuation(String InsuredAddress,String EngNumber,String ChassisNumber,String Make,String Model,String Variant,String ManfactureYear,String Location,String Odometer,String ExtraKms,String InspectionType ) throws InterruptedException {
		System.out.println("Step2Valuation");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Step2_2W.InsuredName(driver);
		Step2_2W.InsuredAddress(driver, InsuredAddress);
		Step2_2W.InsuredMobileNo(driver);
		Step2_2W.vehRegNo(driver);
		Step2_2W.EngineNo(driver, EngNumber);
		Step2_2W.ChassisNo(driver, ChassisNumber);
		Step2_2W.SelectManufacturer(driver, Make);
		Step2_2W.SelectModel(driver, Model);
		Step2_2W.SelectVariant(driver, Variant);
		Step2_2W.SelectmanfacturingYear(driver, ManfactureYear);
		Step2_2W.EnterSurveyLocation(driver, Location);
		Step2_2W.OdometerReading(driver, Odometer);
		Step2_2W.EnterExtraKMS(driver, ExtraKms);
		Step2_2W.InspectionType(driver, InspectionType);
		Step2_2W.paymentmode(driver);
		Step2_2W.ClickOnNext(driver);
		Thread.sleep(2000);
				
		
	}
@Test(priority=4,dependsOnMethods={"Step2Valuation"},dataProvider="2WStep3",dataProviderClass=DataProviders.class)
public void Step3Valuation(String HeadLampCondition,String FrontLeftIndicatorLight,String FrontRightIndicatorLight,String FrontMudguard,String Speedometer,String Handle,String LeverClutch,String FrontHub,String FrontWheelRim,String FrontShockAbsorber,String LegGuard,String LeftCover,String RightCover,String ChassisFrame,String CrankCase,String RearWheelRim,String RearShockAbsorber,String RearDrumDisc,String TailLamp,String RearLeftIndicatorLight,String RearRightIndicatorLight,String ChainCover,String Seats,String RearViewMirror,String RearViewMirrorRT,String Fork,String KickPedal,String RearCowlLeft,String LegShieldLeft,String LegShieldRight,String Fairing,String RearMudguard,String SareeGuard,String Wisor,String Stepney,String StepneyBracket,String RearFootrest,String HelmetBox,String TyresFront,String LuggageCarrier,String  FuelTank,String Silencer,String RcVerified, String VehLocation,String Marketvalue,String VehicleFIttedWithCNGorLPG,String EndorsomentOnRC,String FrontNumberPlate,String RearNumberplate,String Clientcooperation,String VehicleKey,String Startthevehicle,String ChassisNoonvehicle) throws InterruptedException {
System.out.println("Step3Valuation");
Step3_2W.HeadLamp( driver,HeadLampCondition) ;
Step3_2W.FrontLeftIndicatorLight( driver,FrontLeftIndicatorLight);
Step3_2W.FrontRightIndicatorLight( driver,FrontRightIndicatorLight)   ;
Step3_2W.FrontMudguard( driver, FrontMudguard)                        ;
Step3_2W.Speedometer( driver,Speedometer)      ;
Step3_2W.Handle( driver,Handle)                ;
Step3_2W.LeverClutch( driver,LeverClutch)      ;
Step3_2W.FrontHub( driver,FrontHub)            ;
Step3_2W.FrontWheelRim( driver,FrontWheelRim)  ;
Step3_2W.FrontShockAbsorber( driver,FrontShockAbsorber) ;
Step3_2W.LegGuard( driver,LegGuard)     ;
Step3_2W.LeftCover( driver,LeftCover)   ;
Step3_2W.RightCover( driver,RightCover) ;
Step3_2W.ChassisFrame( driver,ChassisFrame)  ;
Step3_2W.CrankCase( driver,CrankCase)        ;
Step3_2W.RearWheelRim( driver,RearWheelRim)  ;
Step3_2W.RearShockAbsorber( driver,RearShockAbsorber) ;
Step3_2W.RearDrumDisc( driver,RearDrumDisc)           ;
Step3_2W.TailLamp( driver,TailLamp)                   ;
Step3_2W.RearLeftIndicatorLight( driver,RearLeftIndicatorLight)    ;
Step3_2W.RearRightIndicatorLight( driver,RearRightIndicatorLight)  ;
Step3_2W.ChainCover( driver,ChainCover)       ;
Step3_2W.Seats( driver,Seats)                 ;     ;
Step3_2W.RearViewMirror( driver,RearViewMirror)     ;
Step3_2W.RearViewMirrorRT( driver,RearViewMirrorRT) ;
Step3_2W.Fork( driver,Fork) ;
Step3_2W.KickPedal( driver,KickPedal) ;
Step3_2W.RearCowlLeft ( driver,RearCowlLeft)       ;
Step3_2W.LegShieldLeft( driver,LegShieldLeft)      ;
Step3_2W.LegShieldRight( driver,LegShieldRight)    ;
Step3_2W.Fairing(driver, Fairing)              ;
Step3_2W.RearMudguard( driver,RearMudguard)    ;
Step3_2W.SareeGuard( driver, SareeGuard)       ;
Step3_2W.Wisor( driver, Wisor)                 ;
Step3_2W.Stepney( driver, Stepney) ;
Step3_2W.StepneyBracket( driver, StepneyBracket)  ;
Step3_2W.RearFootrest( driver, RearFootrest)      ;
Step3_2W.HelmetBox( driver, HelmetBox)            ;
Step3_2W.TyresFront( driver, TyresFront)          ;
Step3_2W.LuggageCarrier( driver, LuggageCarrier)  ;
Step3_2W.FuelTank( driver, FuelTank)        ;
Step3_2W.Silencer( driver, Silencer)        ;
Step3_2W.RcVerified( driver, RcVerified)    ;
Step3_2W.VehicleLocated(driver, VehLocation);
Step3_2W.MarketValue(driver, Marketvalue);
Step3_2W.isVehicleFittedWithCngORlpg(driver, VehicleFIttedWithCNGorLPG);
Step3_2W.CngORlpgendorsedonRC(driver, EndorsomentOnRC);
Step3_2W.FrontNumberplate(driver, FrontNumberPlate);
Step3_2W.RearNumberplate(driver, RearNumberplate);
Step3_2W.Clientcooperation(driver, Clientcooperation);
Step3_2W.VehicleKey(driver, VehicleKey);
Step3_2W.Startthevehicle(driver, Startthevehicle);
Step3_2W.ChassisNoonvehicle(driver, ChassisNoonvehicle);
Step3_2W.ClickOnNextInstep3(driver);
Thread.sleep(2000);
	}
	@Test(priority=4,dependsOnMethods={"Step3Valuation"},dataProvider="2WStep4",dataProviderClass=DataProviders.class)
	public void Step4Valuation(String Status,String CouponDelivery,String Remark) throws InterruptedException, IOException {
		
		Step4_2W.Status(driver, Status);
		Step4_2W.CouponDelivery(driver, CouponDelivery);
		Step4_2W.Remark(driver, Remark);
		Step4_2W.ClickOnNext(driver);
		try {
		Step4_2W.Declaration(driver);
		Step4_2W.Signature(driver);
		}
		catch(NoSuchElementException e) {
			
		}
			
	}
	
	
	
	
	

}
