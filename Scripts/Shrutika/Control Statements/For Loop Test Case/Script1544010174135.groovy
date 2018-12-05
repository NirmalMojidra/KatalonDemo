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

int range = WebUI.getNumberOfTotalOption(findTestObject('Shrutika/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare C'))

for(int i: (0..range-1))
{
	WebUI.selectOptionByIndex(findTestObject('Shrutika/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare C'), i)
	println(WebUI.getAttribute(findTestObject('Shrutika/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare C'), 'value'))
}

for(int i: (0..2))
{
	if(WebUI.check(findTestObject('Shrutika/Page_CURA Healthcare Service/input_Medicare_programs')))
	{
		println("Medicare is already checked thus return")
		return;	
	}
	else{
		WebUI.click(findTestObject('Shrutika/Page_CURA Healthcare Service/input_Medicaid_programs'))
		println("Medicaid is already checked thus cotinue")
		continue;
	}
	println("Inside the loop count : "+i)
}

WebUI.closeBrowser();