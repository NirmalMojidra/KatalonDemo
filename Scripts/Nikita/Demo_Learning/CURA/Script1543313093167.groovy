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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'), Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'), Password)


WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/div_Demo account'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare C'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Apply for hospital readm'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Medicaid'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/td_26'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_Comment_comment'), 'llpk')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Facility'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Hongkong CURA Healthcare Cen'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Apply for hospital readm_1'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Yes'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Healthcare Program'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Medicaid'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Visit Date'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/p_26112018'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Comment'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/p_llpk'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Go to Homepage'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Logout'))

WebUI.closeBrowser()

