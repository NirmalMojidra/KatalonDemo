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
	WebUI.click(findTestObject('Object Repository/Page_The Internet/a_1.jpg'))

// Verifying Downloaded File 
	String downloadPath = 'C:\\Users\\mojidra_n\\Downloads'
	String fileName = '1.jpg' 

	Boolean isFileDownloaded(String downloadPath, String fileName) {
    File dir = new File(downloadPath)

    File[] dirContents = dir.listFiles()

    for (int i = 0; i < dirContents.length; i++) {
        if (dirContents[i].getName().equals(fileName)) {
            return true
        }
    }
    
    return false
}