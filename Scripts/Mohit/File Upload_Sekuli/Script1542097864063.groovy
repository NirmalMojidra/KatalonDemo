import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.sikuli.script.Pattern as Pattern
import org.sikuli.script.Screen as Screen
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def imgDir = RunConfiguration.getProjectDir() + '/img/'

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cgi-lib.berkeley.edu/ex/fup.html')

WebUI.maximizeWindow()

//Thread.sleep(2000)
WebUI.click(findTestObject('Object Repository/Page_Sample File Upload Form/input_File to uploadNotes abou'))

Screen scr = new Screen()

Pattern open = new Pattern(imgDir + 'Open.png')

Pattern fileName = new Pattern(imgDir + 'FileName.png')

Thread.sleep(2000)

scr.paste(fileName, ('D:' + '\\') + 'file.txt')

scr.click(open)