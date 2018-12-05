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



WebUI.openBrowser('https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html')

Count = WebUI.getNumberOfTotalOption(findTestObject('Object Repository/Nikita.A/Select'))

println('COUNT IS' + Count)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Nikita.A/Select'), '0-' + (Count - 1))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Nikita.A/Select'), 'Tuesday', false)

println(WebUI.getText(findTestObject('Object Repository/Nikita.A/Select')))


