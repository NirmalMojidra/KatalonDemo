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

WebUI.openBrowser("http://toolsqa.com/iframe-practice-page/")
WebUI.maximizeWindow()
WebUI.scrollToElement(findTestObject('Shrutika/Page_TOOLSQA  Free QA Automation To/iframe_1'), 1)
WebUI.switchToFrame(findTestObject('Shrutika/Page_TOOLSQA  Free QA Automation To/iframe_1'), 2)

if(!WebUI.verifyElementPresent(findTestObject('Shrutika/Page_TOOLSQA  Free QA Automation To/input_First name_firstname'), 1))
{
	WebUI.refresh()
}
WebUI.scrollToElement(findTestObject('Shrutika/Page_TOOLSQA  Free QA Automation To/input_First name_firstname'),1)
WebUI.setText(findTestObject('Shrutika/Page_TOOLSQA  Free QA Automation To/input_First name_firstname'), 'Shrutika')

WebUI.scrollToElement(findTestObject('Shrutika/Page_TOOLSQA  Free QA Automation To/input_Last name_lastname'),1)
WebUI.setText(findTestObject('Shrutika/Page_TOOLSQA  Free QA Automation To/input_Last name_lastname'), 'Gupta')

WebUI.takeScreenshot("D://Shrutika Stuff//KetalonDemo//"+getClass()+".png")

WebUI.delay(5)
WebUI.switchToDefaultContent()

WebUI.delay(5)
WebUI.switchToFrame(findTestObject('Shrutika/Page_TOOLSQA  Free QA Automation To/iframe_2'), 1)

println(WebUI.getText(findTestObject('Shrutika/Page_TOOLSQA  Free QA Automation To/h2_Hello world')))

WebUI.closeBrowser()


