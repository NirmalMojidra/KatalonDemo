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

WebUI.openBrowser('http://demo.guru99.com/test/delete_customer.php')
WebUI.maximizeWindow()
WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Samanta/Page_Delete Customer/input_Customer ID_cusid'), 'Samanta')
WebUI.click(findTestObject('Object Repository/Samanta/Page_Delete Customer/input_Customer ID_submit'))

WebUI.delay(3)

WebUI.acceptAlert()
WebUI.delay(3)
String text =WebUI.getAlertText()
WebUI.acceptAlert()
println text

WebUI.closeBrowser()