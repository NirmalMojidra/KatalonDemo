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

	WebUI.openBrowser("http://toolsqa.com/handling-alerts-using-selenium-webdriver/")
	WebUI.maximizeWindow()
	WebUI.delay(1)
	WebUI.scrollToElement(findTestObject('Shrutika/Page_TOOLSQA  Free QA Automation To/Simple Alert Pop up text'), 2)
	WebUI.click(findTestObject('Shrutika/Page_TOOLSQA  Free QA Automation To/button_Simple Alert'))
	WebUI.delay(1)
	if(WebUI.waitForAlert(5))
	{
		WebUI.switchToWindowIndex(0)
		WebUI.acceptAlert()
	}
	
	/***********
	 * 
	 * 	WebDriver driver = DriverFactory.getWebDriver()
 		String AlertText = driver.switchTo().alert().getText()
	 * 
	 * ***/
	
	
	WebUI.delay(1)
	WebUI.switchToDefaultContent()
	WebUI.click(findTestObject('Shrutika/Page_TOOLSQA  Free QA Automation To/button_Confirm Pop up'))
	WebUI.delay(1)
	if(WebUI.waitForAlert(2))
	{
		WebUI.switchToWindowIndex(0)
		WebUI.dismissAlert()
	}

	WebUI.delay(2)
	WebUI.switchToDefaultContent()
	WebUI.click(findTestObject('Shrutika/Page_TOOLSQA  Free QA Automation To/button_Prompt Pop up'))
	WebUI.delay(2)
	if(WebUI.waitForAlert(5))
	{
		WebUI.switchToWindowIndex(0)
		println(WebUI.getAlertText())
		//WebUI.setAlertText("Yes")
		WebUI.delay(2)
		WebUI.acceptAlert()
	}
		
	WebUI.switchToDefaultContent()
	WebUI.closeBrowser()
