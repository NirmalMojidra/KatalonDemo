import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
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

def Request =(RequestObject)findTestObject('Object Repository/Abhineet/postCustomer')
String body = '{"FirstName": "Obhineet","LastName": "Mish","UserName": "rush5efu123","Password": "#rtggh5fhfh","Email": "rupsh9efu@gmail.com"}'
Request.setBodyContent(new HttpTextBodyContent(body))
def Response=WS.sendRequest(Request)
WS.verifyElementPropertyValue(Response, "SuccessCode", "OPERATION_SUCCESS", FailureHandling.STOP_ON_FAILURE)
WS.verifyElementPropertyValue(Response, "Message", "Operation completed successfully", FailureHandling.STOP_ON_FAILURE)
