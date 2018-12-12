import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.sun.java.util.jar.pack.Instruction.Switch as Switch
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Shrutika/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Shrutika/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.setText(findTestObject('Shrutika/Page_CURA Healthcare Service/input_Password_password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Shrutika/Page_CURA Healthcare Service/button_Login'))

int option = 2;

switch (option) {
    case 1:
	println("Medicare")
	WebUI.click(ObjectRepository.findTestObject('Shrutika/Page_CURA Healthcare Service/input_Medicare_programs'))
	WebUI.verifyElementChecked(findTestObject('Shrutika/Page_CURA Healthcare Service/input_Medicare_programs'),10)
	break
    
	case 2:
	println("Medicaid")
    WebUI.click(ObjectRepository.findTestObject('Shrutika/Page_CURA Healthcare Service/input_Medicaid_programs'))
    WebUI.verifyElementChecked(findTestObject('Shrutika/Page_CURA Healthcare Service/input_Medicaid_programs'),10)
	break
	
	case 3:
	println("None")
	WebUI.click(ObjectRepository.findTestObject('Shrutika/Page_CURA Healthcare Service/input_None_programs'))
	WebUI.verifyElementChecked(findTestObject('Shrutika/Page_CURA Healthcare Service/input_None_programs'), 10)
	break
	
	default:
	println("Invalid option is selected")
    break
}

WebUI.closeBrowser()

