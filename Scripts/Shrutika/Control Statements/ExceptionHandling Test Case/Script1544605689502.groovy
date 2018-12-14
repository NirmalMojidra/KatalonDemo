import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/');
WebUI.maximizeWindow()

WebUI.click(findTestObject('Shrutika/Page_CURA Healthcare Service/a_Make Appointment'))
WebUI.setText(findTestObject('Shrutika/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')
WebUI.setText(findTestObject('Shrutika/Page_CURA Healthcare Service/input_Password_password'), 'ThisIsNotAPassword')
WebUI.click(findTestObject('Shrutika/Page_CURA Healthcare Service/button_Login'))
WebUI.click(findTestObject('Shrutika/Page_CURA Healthcare Service/input_Medicaid_programs'))
WebUI.click(findTestObject('Shrutika/Page_CURA Healthcare Service/input_Medicttaid_programs'), FailureHandling.CONTINUE_ON_FAILURE)


try {
	    
		WebUI.click(findTestObject('Shrutika/Page_CURA Healthcare Service/input_Medicaid_programs'))
		println("Medicaid is already checked thus cotinue")
		println (System.getProperty("user.dir"))
	WebUI.takeScreenshot(System.getProperty("user.dir")+"//Include/Snapshots/"+getClass()+".png")
		throw new com.kms.katalon.core.exception.KatalonRuntimeException("This is Katalon run time exception")
} catch (Exception e) {
	e.printStackTrace()
	this.println("General issue occur")
} finally{
	WebUI.closeBrowser();
}
