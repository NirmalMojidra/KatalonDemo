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
import java.io.FileInputStream as FileInputStream
import java.io.FileNotFoundException as FileNotFoundException
import java.io.FileOutputStream as FileOutputStream
import java.io.IOException as IOException
import org.apache.poi.ss.usermodel.Cell as Cell
import org.apache.poi.ss.usermodel.Row as Row
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

WebUI.click(findTestObject('Object Repository/Basiclogin/span_Username (1)'))

WebUI.setText(findTestObject('Object Repository/Basiclogin/input_LOGIN Panel_txtUsername (1)'), Username)
//WebUI.click(findTestObject('Object Repository/Basiclogin/input_Username_txtPassword'))

WebUI.setText(findTestObject('Object Repository/Basiclogin/input_Username_txtPassword'), Password)

WebUI.click(findTestObject('Object Repository/Basiclogin/input_Password_Submit (1)'))

//CustomKeywords.'nikitas.a.Sample.checkelement'(findTestObject('Object Repository/Basiclogin/a_Welcome Admin'))

Text = WebUI.getText(findTestObject('Object Repository/Basiclogin/span_Assign Leave'))

WebUI.verifyEqual(Text, "Assign123", FailureHandling.CONTINUE_ON_FAILURE)


CustomKeywords.'nikitas.a.Sample.checkelement'(findTestObject('Object Repository/Basiclogin/img'))

WebUI.click(findTestObject('Basiclogin/img'))

WebUI.setText(findTestObject('Object Repository/Basiclogin/input__timeemployeeName'), 'abc')

WebUI.click(findTestObject('Object Repository/Basiclogin/input__btnView (1)'))

WebUI.verifyElementPresent(findTestObject('Basiclogin/span_Invalid'), 0)

WebUI.closeBrowser()

