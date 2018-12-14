import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testobject.RequestObject
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import java.util.List
import java.util.concurrent.locks.Condition
import java.util.ArrayList
import com.kms.katalon.core.testobject.TestObjectProperty
import groovy.json.JsonSlurper


def Request =(RequestObject)findTestObject('Object Repository/Abhineet/GetTempratureOfCity')
def Response = WS.sendRequest(Request)
String jsonString = Response
WS.verifyResponseStatusCode(Response, 200)
println(Response.toString())
//WS.verifyElementText(Response, "City", "Hyderabad", FailureHandling.STOP_ON_FAILURE)
WS.containsString(Response, "Hyderabad", false)
