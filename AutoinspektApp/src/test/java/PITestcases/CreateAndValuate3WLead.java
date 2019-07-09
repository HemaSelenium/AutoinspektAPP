package PITestcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import Pages.Create2WLead;
import common.BaseClass;
import common.DataProviders;

public class CreateAndValuate3WLead extends BaseClass{
protected static Create2WLead PI2W= new Create2WLead();
	
	@Test(priority=1,dataProvider="login",dataProviderClass=DataProviders.class)
	public void Login(String UserName, String Password) throws InterruptedException {
	helper.login(driver, UserName, Password);
	}
	
	@Test(priority=2,dataProvider="3WLeadCreate",dataProviderClass=DataProviders.class,dependsOnMethods={"Login"})
	public void Add3wLead(String AgentMobile,String EnterAgentCode,String IntimatorNmae,String IntimatorEmail,String InsurereName,String DivisionName,String BranchNmae,String InsurereRefNo,String InsuredNmae,String InsuredMobileNO,String VehicleRegNo,String contactPersonMobNumber,String InspectionType,String VehicleType,String PaymentMode) throws InterruptedException, IOException {
		
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
	
	@Test(priority=3,dependsOnMethods={"Add3wLead"})
	public void Step1Valuation() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvVideo");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/btnCapture");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		helper.CaptureImagesUsingContinousCamera(driver);
		Thread.sleep(2000);
		
	}
}
