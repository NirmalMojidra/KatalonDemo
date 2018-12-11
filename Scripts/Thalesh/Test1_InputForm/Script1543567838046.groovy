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
import com.kms.katalon.core.testdata.InternalData


WebUI.openBrowser(null)

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.seleniumeasy.com/test')

WebUI.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Page_Home/li_All Examples'), 10)

WebUI.scrollToElement(findTestObject('Page_Home/li_All Examples'), 5)

WebUI.click(findTestObject('Object Repository/Page_Home/a_Input Forms'))

WebUI.click(findTestObject('Object Repository/Page_Home/a_InputFormSubmit'))
//def x=data.internallyGetValue("demo_usn", 1)
 WebUI.setText(findTestObject('Object Repository/Page_Home/input_FirstName'),'thalesh')
 WebUI.setText(findTestObject('Object Repository/Page_Home/input_LastName'),'Sharma')
 WebUI.setText(findTestObject('Object Repository/Page_Home/input_EMail'),'thalesh@gmail.com')
 WebUI.setText(findTestObject('Object Repository/Page_Home/input_Phone'),'1234567890')
 WebUI.setText(findTestObject('Object Repository/Page_Home/input_Address'),'Baner, Pune')
 WebUI.setText(findTestObject('Object Repository/Page_Home/input_City'),'Pune')
 
 WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Home/select_State'), 'California', false)
 
 WebUI.setText(findTestObject('Object Repository/Page_Home/input_ZipCode'),'EJ08 2EX')
 
 WebUI.setText(findTestObject('Object Repository/Page_Home/input_Website'),'www.facebook.com')
  
 WebUI.click(findTestObject('Object Repository/Page_Home/input_hosting'))
 
 WebUI.setText(findTestObject('Object Repository/Page_Home/Project Description'), 'test')
 
 WebUI.click(findTestObject('Object Repository/Page_Home/button_Send'))
 