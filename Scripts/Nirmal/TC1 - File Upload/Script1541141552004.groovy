import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// WebSite Url
WebUI.openBrowser('http://demo.guru99.com/test/upload/')

// Maximizing Window 
WebUI.maximizeWindow()

// Clicking On Upload Button
WebUI.click(findTestObject('Object Repository/Page_File Upload Demo/input_New Tours_uploadfile_0'))

// Calling Autoit Custom Function 
autoit()

// Clicking On Submit Button
WebUI.click(findTestObject('Object Repository/Page_File Upload Demo/button_Submit File')) // Auto it Script

def autoit() {
    Runtime RT = Runtime.getRuntime()
	def FileDir = RunConfiguration.getProjectDir() + '/FileUploadAutoit/fileupload.exe'
    Process P = RT.exec(FileDir)
}

WebUI.delay(5)

WebUI.closeBrowser()

println "--------> File Uploaded Sucessfully <--------"