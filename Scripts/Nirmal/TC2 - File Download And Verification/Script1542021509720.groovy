import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After as After
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

// WebSite Url
WebUI.openBrowser('https://the-internet.herokuapp.com/download')

// Maximizing Window
WebUI.maximizeWindow()

// Clicking on File to Download
WebUI.click(findTestObject('Object Repository/Page_The Internet/a_some-file.txt'))

// Getting Total No Of Files In The Destination Folder and Verifying it 

		File downloadFolder = new File("C:\\Users\\mojidra_n\\Downloads\\");
		List<String> namesOfFiles = Arrays.asList(downloadFolder.list());
		if (namesOfFiles.contains("some-file.txt")) 
		{
			println 'Success'

		} else 
		{
			println 'Failure'
		}
		
WebUI.delay(10)
				
WebUI.closeBrowser()
