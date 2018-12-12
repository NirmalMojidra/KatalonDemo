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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demo.guru99.com/test/upload/')

obj = findTestObject('Object Repository/Thalesh/UploadFile/Page_FileUploadDemo/button_ChooseFile')

WebUI.uploadFile(obj, 'C:\\Users\\C5281583\\testUploadFile.txt')

WebUI.click(findTestObject('Thalesh/UploadFile/Page_FileUploadDemo/input_AcceptTerms'))

WebUI.click(findTestObject('Thalesh/UploadFile/Page_FileUploadDemo/button_SubmitFile'))

WebUI.scrollToPosition(0, 100)

WebUI.delay(3)

String message=WebUI.getText(findTestObject('Thalesh/UploadFile/Page_FileUploadDemo/h3_message'))

WebUI.verifyMatch(message.replace('\n',' '), '1 file has been successfully uploaded.', false)
