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

// Open Browser & navigating to Url
WebUI.openBrowser(Url)

// Maximizing Window
WebUI.maximizeWindow()

// Verifying the element before doing mouse hover
if (WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SiteOrigin - Free WordPress Th/a_Plugins'))) {
    WebUI.mouseOver(findTestObject('Object Repository/Page_SiteOrigin - Free WordPress Th/a_Plugins'))
}

// Wait
WebUI.delay(3)

// Calling custom keyword to take screenshot
CustomKeywords.'com.util.TakeScreenshot.takeScreenshotOfWebPage'(filename)

// Closing the browser
WebUI.closeBrowser()


