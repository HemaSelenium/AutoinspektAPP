package Pages;
import java.util.concurrent.TimeUnit;
import common.AppiumHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Create2WLead {
	
	protected static AppiumHelper helper = new AppiumHelper();
	
	public static String AgentMobileNumber = "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etIntMNo";
	public static String Agentcode = "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etIntAgtCode";
	public static String IntimatorName = "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etIntAgtName";
	public static String IntimatorEmail = "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etIntEmail";
	public static String InsurereName = "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvInsName";
	public static String DivisionName = "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvDivName";
	public static String BranchNmae = "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvBrhName";
	public static String InsurereRefNo = "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etInsRefNo";
	public static String InsuredNmae = "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etInsdName";
	public static String InsuredMobileNO = "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etInsdMNo";
	public static String VehicleRegNo = "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etVehiRegNo";
	public static String ContactPersonMobNumber = "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etCntPerMNo";
	public static String InspectionType = "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvInsType";
	public static String VehicleType = "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/tvVehicleCat";
	public static String PaymentMode = "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/ivSelectPaymentMode";
	
	public static String FeeAmount = "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etFeesAmount";
	public static String ConveyanceCash = "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etConveyanceCash";
	public static String CashToBeCollected = "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etCashToBeCollected";
	public static String Submit = "//android.widget.Button[@text='SUBMIT']";
            
	public void ClickOnAddJob(AndroidDriver<MobileElement> driver) throws InterruptedException {

		helper.clickOnElementByAccessabilityID(driver, "Open navigation drawer");

		helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/llAddJob");

	}

	public void EnterAgentMobileNumber(AndroidDriver<MobileElement> driver, String MobileNUmber) {
		helper.SendkeysById(driver, AgentMobileNumber, MobileNUmber);
		

	}

	public void EnterAgentCode(AndroidDriver<MobileElement> driver, String AgentCode) {
		helper.SendkeysById(driver, Agentcode, AgentCode);

	}

	public void IntimatorNmae(AndroidDriver<MobileElement> driver, String Intimatorname) {
		helper.SendkeysById(driver, IntimatorName, Intimatorname);

	}

	public void IntimatorEmail(AndroidDriver<MobileElement> driver, String IntimatorMail) {
		helper.SendkeysById(driver, IntimatorEmail, IntimatorMail);

	}

	public void InsurereName(AndroidDriver<MobileElement> driver, String NmaeoftheInsurer) throws InterruptedException {
		helper.clickOnElementByID(driver, InsurereName);
		/*helper.clickOnElementByID(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etSearch");
	helper.SendkeysById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etSearch", NmaeoftheInsurer);	*/
		helper.ScrollToViewElement(driver, NmaeoftheInsurer);
	//helper.clickOnElementByID(driver, "android:id/text1");
	//driver.findElementById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etSearch").sendKeys(Keys.ARROW_DOWN);
	//driver.findElementById("co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etSearch").sendKeys(Keys.ENTER);
		//helper.SendkeysById(driver, "co.in.mfcwl.valuation.autoinspekt.autoinspekt:id/etSearch", Keys.ARROW_DOWN);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='"+NmaeoftheInsurer+"']");

	
		//System.out.println(NmaeoftheInsurer);
	/*List<MobileElement> insurerlist =driver.findElementsById("android:id/text1");
	for(int i=0; i<insurerlist.size();i++) {
		System.out.println(insurerlist.size());
		System.out.println(insurerlist.get(i).getText());
		
		//helper.ScrollToViewElement(driver, NmaeoftheInsurer);
		if(insurerlist.get(i).getText().equals(NmaeoftheInsurer)) {
			System.out.println("equal");
			helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + NmaeoftheInsurer + "']");
			break;
		}
	}*/

		//helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + NmaeoftheInsurer + "']");

	}

	public void DivisionName(AndroidDriver<MobileElement> driver, String Divisionname) throws InterruptedException {
		helper.clickOnElementByID(driver, DivisionName);
		helper.ScrollToViewElement(driver, Divisionname);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Divisionname + "']");

	}

	public void BranchNmae(AndroidDriver<MobileElement> driver, String Branchname) throws InterruptedException {
		helper.clickOnElementByID(driver, BranchNmae);

		helper.ScrollToViewElement(driver, Branchname);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + Branchname + "']");

	}

	public void InsurereRefNo(AndroidDriver<MobileElement> driver, String InsurerRefNo) {
		helper.SendkeysById(driver, InsurereRefNo, InsurerRefNo);

	}

	public void InsuredNmae(AndroidDriver<MobileElement> driver, String InsuredName) {
		helper.SendkeysById(driver, InsuredNmae, InsuredName);

	}

	public void InsuredMobileNO(AndroidDriver<MobileElement> driver, String InsuredMobileNum) {
		helper.SendkeysById(driver, InsuredMobileNO, InsuredMobileNum);

	}

	public void VehicleRegNo(AndroidDriver<MobileElement> driver, String VehRegNo) {
		helper.SendkeysById(driver, VehicleRegNo, VehRegNo);

	}

	public void contactPersonMobNumber(AndroidDriver<MobileElement> driver, String ContMobileNumber) {
		helper.SendkeysById(driver, ContactPersonMobNumber, ContMobileNumber);

	}

	public void InspectionType(AndroidDriver<MobileElement> driver, String TypeOfInspection) throws InterruptedException {
		helper.ScrollInMainPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.clickOnElementByID(driver, InspectionType);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + TypeOfInspection + "']");
	}

	public void VehicleType(AndroidDriver<MobileElement> driver, String VehicleCategory) throws InterruptedException {

		helper.clickOnElementByID(driver, VehicleType);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + VehicleCategory + "']");
		Thread.sleep(2000);

	}

	public void PaymentMode(AndroidDriver<MobileElement> driver, String ModeofPayment) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helper.clickOnElementByID(driver, PaymentMode);
		helper.clickOnElementByXpath(driver, "//android.widget.TextView[@text='" + ModeofPayment + "']");

	}

	public void FeeAmount(AndroidDriver<MobileElement> driver) {
		System.out.println("FeeAmount: " + AppiumHelper.FindElementById(driver, FeeAmount).getText());

	}

	public void ConveyanceCash(AndroidDriver<MobileElement> driver) {
		System.out.println("Conveyance Cash: " + AppiumHelper.FindElementById(driver, ConveyanceCash).getText());

	}

	public void CashTobecollected(AndroidDriver<MobileElement> driver) {
		System.out.println("Cahto be colleted: " + AppiumHelper.FindElementById(driver, CashToBeCollected).getText());

	}

	public void Submit(AndroidDriver<MobileElement> driver) {
		helper.clickOnElementByXpath(driver, Submit);
	}

}
