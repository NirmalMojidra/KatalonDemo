import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.testng.Assert

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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.maximizeWindow()
WebUI.waitForPageLoad(3)
WebUI.click(findTestObject('Object Repository/Samanta/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/Samanta/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Samanta/Page_CURA Healthcare Service/input_Password_password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Samanta/Page_CURA Healthcare Service/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Samanta/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare C'), 
    'Hongkong CURA Healthcare Center', true)
CustomKeywords.'samanta.util.checkbox.CheckBoxHandler.selectCheckBox'(findTestObject('Object Repository/Samanta/Page_CURA Healthcare Service/input_Apply for hospital readm'))

CustomKeywords.'samanta.util.checkbox.CheckBoxHandler.selectCheckBox'(findTestObject('Object Repository/Samanta/Page_CURA Healthcare Service/input_Medicaid_programs'))
WebUI.click(findTestObject('Object Repository/Samanta/Page_CURA Healthcare Service/calender'))

WebUI.click(findTestObject('Object Repository/Samanta/Page_CURA Healthcare Service/td_20'))

WebUI.setText(findTestObject('Object Repository/Samanta/Page_CURA Healthcare Service/textarea_Comment_comment'), 'Cardio check')

WebUI.click(findTestObject('Object Repository/Samanta/Page_CURA Healthcare Service/button_Book Appointment'))

String actualValue = WebUI.getText(findTestObject('Object Repository/Samanta/Page_CURA Healthcare Service/comment'))
String expectedValue = 'Cardio check'

Assert.assertEquals(expectedValue, actualValue)

WebUI.closeBrowser()