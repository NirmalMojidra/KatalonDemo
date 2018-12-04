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

// WebSite Url
WebUI.openBrowser('http://demo.guru99.com/test/upload/')

// Maximizing Window 
WebUI.maximizeWindow()

// Clicking On Upload Button
WebUI.click(findTestObject('Object Repository/Page_File Upload Demo/input_New Tours_uploadfile_0'))

// Calling Autoit Custom Function 
autoit()

// Clicking On Submit Button
WebUI.click(findTestObject('Object Repository/Page_File Upload Demo/button_Submit File')) // Auto it Script

def autoit() {
    Runtime RT = Runtime.getRuntime()

    Process P = RT.exec('"D:\\Demo\\KatalonDemo\\FileUploadAutoit\\fileupload.exe"')
}

