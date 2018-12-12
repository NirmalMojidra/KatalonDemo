import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')

WebUI.maximizeWindow();

WebUI.click(findTestObject('Shrutika/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Shrutika/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.setText(findTestObject('Shrutika/Page_CURA Healthcare Service/input_Password_password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Shrutika/Page_CURA Healthcare Service/button_Login'))

if(WebUI.check(findTestObject('Shrutika/Page_CURA Healthcare Service/input_Medicare_programs')))
	{
		println("Medicare")
		WebUI.click(ObjectRepository.findTestObject('Shrutika/Page_CURA Healthcare Service/input_Medicare_programs'))
		WebUI.verifyElementChecked(findTestObject('Shrutika/Page_CURA Healthcare Service/input_Medicare_programs'), 10)
	}
//this option will be selected
else if(!WebUI.check(findTestObject('Shrutika/Page_CURA Healthcare Service/input_Medicaid_programs')))
	{
		println("Medicaid")
		WebUI.click(ObjectRepository.findTestObject('Shrutika/Page_CURA Healthcare Service/input_Medicaid_programs'))
		WebUI.verifyElementChecked(findTestObject('Shrutika/Page_CURA Healthcare Service/input_Medicaid_programs')  , 10)
	}
else{
	println("None")
	WebUI.click(ObjectRepository.findTestObject('Shrutika/Page_CURA Healthcare Service/input_None_programs'))
	WebUI.verifyElementChecked(findTestObject('Shrutika/Page_CURA Healthcare Service/input_None_programs'), 10)
}
WebUI.closeBrowser()