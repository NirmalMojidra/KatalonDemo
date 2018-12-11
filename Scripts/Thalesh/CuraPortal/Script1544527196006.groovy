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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Thalesh/Page_CURA/a_MakeAppointment'))

WebUI.setText(findTestObject('Thalesh/Page_CURA/input_Username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Thalesh/Page_CURA/input_Password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Thalesh/Page_CURA/button_Login'))

WebUI.selectOptionByValue(findTestObject('Thalesh/Page_CURA/select_CURAHealthcare'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Thalesh/Page_CURA/input_ApplyHospitalReadm'))

WebUI.setText(findTestObject('Thalesh/Page_CURA/input_VisitDate'), '01/01/2019')

WebUI.setText(findTestObject('Thalesh/Page_CURA/textarea_Comment'), 'Please book a appointment for me')

WebUI.click(findTestObject('Thalesh/Page_CURA/button_BookAppointment'))

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Thalesh/Page_CURA/p_Facility'), 'innertext', 'Hongkong CURA Healthcare Center', 5)

WebUI.closeBrowser()

