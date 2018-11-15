import org.sikuli.script.Pattern as Pattern
import org.sikuli.script.Screen as Screen
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def imgDir = RunConfiguration.getProjectDir() + '/img/'

Thread.sleep(2000)
WebUI.openBrowser("https://html5demos.com/drag/")

//WebUI.navigateToUrl('https://html5demos.com/drag/')

WebUI.maximizeWindow()

Thread.sleep(2000)

Screen screen = new Screen()

Pattern one = new Pattern(imgDir + 'one.png')

Pattern drop = new Pattern(imgDir + 'drop.png')

Thread.sleep(2000)

screen.dragDrop(one, drop)

