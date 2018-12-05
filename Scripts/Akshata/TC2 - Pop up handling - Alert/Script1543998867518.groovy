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

WebUI.openBrowser("http://toolsqa.com/handling-alerts-using-selenium-webdriver/")

WebUI.maximizeWindow()

//Alert with OK button
WebUI.click(findTestObject('Object Repository/Toolsqa - Alert handling/Simple Alert'))

alert_text = WebUI.getAlertText()

assert alert_text == 'A simple Alert'

WebUI.delay(3)

WebUI.acceptAlert()

//Alert with OK/CANCEL button
WebUI.click(findTestObject('Object Repository/Toolsqa - Alert handling/Confirm Pop up'))

alert_text = WebUI.getAlertText()

assert alert_text == 'Confirm pop up with OK and Cancel button'

//WebUI.delay(3)

WebUI.dismissAlert()
