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


// Registration
WebUI.openBrowser('')

WebUI.navigateToUrl('http://demowebshop.tricentis.com/')

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop/a_Register'))

WebUI.click(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Register/input_Gender_Gender'))

WebUI.sendKeys(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Register/input_First name_FirstName'), 'test123')

WebUI.sendKeys(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Register/input_Last name_LastName'), 'katalon')

WebUI.sendKeys(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Register/input_Email_Email'),GlobalVariable.Email)

WebUI.sendKeys(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Register/input_Password_Password'),GlobalVariable.Password)

WebUI.sendKeys(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Register/input_Confirm password_Confirm'),GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Register/input__register-button'))

WebUI.click(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Register/input_Your registration comple'))


// Selecting A Product From Product Category and Click:

WebUI.mouseOver(findTestObject('Object Repository/Page_Demo Web Shop/a_Computers'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop/a_Desktops'))

//Adding Product to The Cart

WebUI.click(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Desktops/input_Build it_button-2 produc'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Build your own/input_Qty_add-to-cart-button-7'))

// Navigating to Cart

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Build your own/span_Shopping cart'))






