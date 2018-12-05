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

WebUI.navigateToUrl('http://toolsqa.com/automation-practice-form/')

WebUI.setText(findTestObject('Shrutika/Page_Demo Form for practicing Selen/input_First name_firstname'), 'Shrutika Gupta')

WebUI.setText(findTestObject('Shrutika/Page_Demo Form for practicing Selen/input_Last name_lastname'), 'Sakharkar')

WebUI.click(findTestObject('Shrutika/Page_Demo Form for practicing Selen/input_Sex_sex'))

WebUI.click(findTestObject('Shrutika/Page_Demo Form for practicing Selen/input_Years of Experience_exp'))

WebUI.setText(findTestObject('Shrutika/Page_Demo Form for practicing Selen/input_Years of Experience_date'), '2-12-2018')

WebUI.click(findTestObject('Shrutika/Page_Demo Form for practicing Selen/input_Profession_profession'))

WebUI.click(findTestObject('Shrutika/Page_Demo Form for practicing Selen/input_Profession_profession_1'))

WebUI.click(findTestObject('Shrutika/Page_Demo Form for practicing Selen/input_Automation Tool_tool'))

WebUI.click(findTestObject('Shrutika/Page_Demo Form for practicing Selen/input_Automation Tool_tool_1'))

WebUI.selectOptionByValue(findTestObject('Shrutika/Page_Demo Form for practicing Selen/select_Browser CommandsNavigat'), 
    'Browser Commands', true)

WebUI.click(findTestObject('Shrutika/Page_Demo Form for practicing Selen/button_Button'))

WebUI.closeBrowser()

