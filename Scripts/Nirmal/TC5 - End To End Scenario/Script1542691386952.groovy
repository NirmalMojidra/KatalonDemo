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
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement


// Registration Module :
WebUI.openBrowser('')

WebUI.navigateToUrl('http://demowebshop.tricentis.com/')

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop/a_Register'))

WebUI.click(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Register/input_Gender_Gender'))

WebUI.sendKeys(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Register/input_First name_FirstName'), First_name)

WebUI.sendKeys(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Register/input_Last name_LastName'), Last_name)

WebUI.sendKeys(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Register/input_Email_Email'),GlobalVariable.Email)

WebUI.sendKeys(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Register/input_Password_Password'),GlobalVariable.Password)

WebUI.sendKeys(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Register/input_Confirm password_Confirm'),GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Register/input__register-button'))

WebUI.click(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Register/input_Your registration comple'))

WebUI.delay(5)

// Selecting A Product From Product Category and Click :
WebUI.mouseOver(findTestObject('Object Repository/Page_Demo Web Shop/a_Computers'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop/a_Desktops'))

WebUI.delay(5)

// Adding Product to The Cart :
WebUI.click(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Desktops/input_Build it_button-2 produc'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Build your own/input_Qty_add-to-cart-button-7'))

WebUI.delay(5)

// Navigating to Cart :
WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Build your own/span_Shopping cart'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Shopping Cart/select_Select countryUnited St'),'India', false)

WebUI.sendKeys(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Shopping Cart/input_Zip  postal code_ZipPost'),Zip_postal_code)

WebUI.click(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Shopping Cart/input_Zip  postal code_estimat'))

WebUI.click(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Shopping Cart/input_I agree with the terms o'))

WebUI.click(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Shopping Cart/button_Checkout'))

WebUI.delay(5)

// CheckOut Page :

// Billing Address :

WebUI.setText(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Checkout/input_Company_BillingNewAddres'), Company)

WebUI.selectOptionByLabel(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Checkout/select_Select countryUnited St'), 'India', false)

WebUI.setText(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Checkout/input_City_BillingNewAddress.C'), City)

WebUI.setText(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Checkout/input_Address 1_BillingNewAddr'), Address_1)

WebUI.setText(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Checkout/input_Address 2_BillingNewAddr'), Address_2)

WebUI.setText(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Checkout/input_Zip  postal code_Billing'), Zip_postal_code_1)

WebUI.setText(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Checkout/input_Phone number_BillingNewA'), Phone_number)

WebUI.setText(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Checkout/input_Fax number_BillingNewAdd'), Fax_number)

WebUI.click(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Checkout/input__button-1 new-address-ne'))

// Shipping Address : 

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Checkout/input__button-1 Custom'), 10)

WebDriver driver =  DriverFactory.getWebDriver()

WebElement elem = driver.findElement(By.xpath("(//input[@type = 'button' and @class = 'button-1 new-address-next-step-button' and @title = 'Continue' and @value = 'Continue'])[2]"))

WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(elem))

// input[@type = 'button' and @class = 'button-1 new-address-next-step-button' and @title = 'Continue' and @value = 'Continue' and @onclick= 'Shipping.save()']

// (//input[@type = 'button' and @class = 'button-1 new-address-next-step-button' and @title = 'Continue' and @value = 'Continue'])[2]

//WebUI.click(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Checkout/input__button-1 Custom'))

// Shipping Method :
WebUI.verifyElementPresent(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Checkout/input_Ground (0.00)_shippingop'), 10)

WebUI.click(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Checkout/input_Ground (0.00)_shippingop'))

WebUI.click(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Checkout/input__button-1 shipping-metho'))

// Payment Method Selecting Credit Card :
WebUI.click(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Checkout/input_Check  Money Order (5.00'))

WebUI.click(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Checkout/input__button-1 payment-method'))

WebUI.delay(5)

// Payment Info :


WebUI.selectOptionByValue(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Checkout/select_VisaMaster cardDiscover'), 'MasterCard', false)

WebUI.sendKeys(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Checkout/input_Cardholder name_Cardhold'),Cardholder_name)

WebUI.sendKeys(findTestObject('Object Repository/End To End Senario/Page_Demo Web Shop. Checkout/input_Card number_CardNumber'), Card_number)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/select_01020304050607080910111'),'3' ,false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/select_20182019202020212022202'),'2020',false)

WebUI.sendKeys(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/input_Card code_CardCode'), Card_code)

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/input__button-1 payment-info-n'))

WebUI.delay(5)

// Confirm Order 

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/input__button-1 confirm-order-'))

// Thank You Page

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/input_Click here for order det'))

