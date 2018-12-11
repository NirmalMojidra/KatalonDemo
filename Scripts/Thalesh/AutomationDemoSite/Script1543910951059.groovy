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
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(null)

WebUI.navigateToUrl('http://demo.automationtesting.in/Register.html')

WebUI.setText(findTestObject('DemoAuto/input_FirstName'), 'thalesh')

WebUI.setText(findTestObject('DemoAuto/input_LastName'), 'sharma')

WebUI.setText(findTestObject('DemoAuto/textarea_Address'), 'test text area')

WebUI.setText(findTestObject('DemoAuto/input_EmailAddress'), 'thalesh.s@gmail.com')

WebUI.setText(findTestObject('Object Repository/DemoAuto/input_Phone'), '1234567890')

WebUI.click(findTestObject('DemoAuto/input_GenderRadioOptions'))

WebUI.click(findTestObject('DemoAuto/input_HobbiesCheckbox'))
//WebUI.click(findTestObject('DemoAuto/testObject'))

//-----------------------------
//WebUI.click(findTestObject('DemoAuto/div_Languages')) //--------------Language : Hindi/ English-----------------
//WebUI.click(findTestObject('DemoAuto/li_Language1'))
//WebUI.click(findTestObject('DemoAuto/li_Language2'))
//WebUI.click(findTestObject('DemoAuto/li_Language3'))
//--------------------------------------
WebUI.scrollToElement(findTestObject('DemoAuto/select_Skills'),5) // scroll the page
WebUI.click(findTestObject('DemoAuto/select_Skills'))
WebUI.selectOptionByValue(findTestObject('DemoAuto/select_Skills'), 'Java', true)
WebUI.click(findTestObject('DemoAuto/select_Country'))
WebUI.selectOptionByValue(findTestObject('DemoAuto/select_Country'), 'United Kingdom', true)

//-------------------------------------------
WebUI.click(findTestObject('DemoAuto/li_Country0')) //----------------Inida--------------
//WebUI.click(findTestObject('DemoAuto/li_Country'))
//------------------------------------------

obj= new TestObject("TheObjectName")
obj.addProperty("xpath", ConditionType.EQUALS,"//ul[@id='select2-country-results']/li[text()='India']")

WebUI.click(obj)

WebUI.selectOptionByValue(findTestObject('DemoAuto/select_Year'), '1990', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/DemoAuto/select_Month'), 'January', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/DemoAuto/select_Day'), '1', true)

WebUI.setText(findTestObject('DemoAuto/input_FirstPassword'), 'Tt123456')

WebUI.setText(findTestObject('DemoAuto/input_ConfirmPassword'), 'Tt123456')

WebUI.click(findTestObject('Object Repository/DemoAuto/button_Submit'))

WebUI.closeBrowser()

