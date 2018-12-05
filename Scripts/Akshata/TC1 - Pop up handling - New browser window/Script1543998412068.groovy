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

//Open url
WebUI.openBrowser("http://toolsqa.com/automation-practice-switch-windows/")

//Maximize window
WebUI.maximizeWindow()

//Click on New browser window
WebUI.click(findTestObject('Object Repository/Toolsqa - switch window/New browser window'))

//Switch to new opened window
WebUI.switchToWindowIndex(1)

title = WebUI.getWindowTitle()

assert title == 'QA Automation Tools Tutorial'

WebUI.closeWindowTitle(title)

//Switch to the default window
WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/Toolsqa - switch window/New Message Window'))

//Switch to new opened window
WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.closeWindowIndex(1)

//Switch to the default window
WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/Toolsqa - switch window/New Browser Tab'))

WebUI.switchToWindowIndex(1)

assert title == 'QA Automation Tools Tutorial'

WebUI.closeWindowTitle(title)

WebUI.switchToWindowIndex(0)
//Open two new windows. Switch to 2nd window, close 2nd window, close 1st window without switching
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Toolsqa - switch window/New browser window'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Toolsqa - switch window/New Browser Tab'))
WebUI.delay(3)

WebUI.switchToWindowIndex(2)
assert title == 'QA Automation Tools Tutorial'
WebUI.closeWindowIndex(2)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.closeBrowser()
