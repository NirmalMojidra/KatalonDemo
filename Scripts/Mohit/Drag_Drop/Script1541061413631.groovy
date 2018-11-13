import org.sikuli.script.Pattern
import org.sikuli.script.Screen

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://html5demos.com/drag/')

WebUI.maximizeWindow()

Thread.sleep(2000)

Screen screen = new Screen();
Pattern one = new Pattern("C:/Users/bhanawat_m/Pictures/img/one.PNG");
Pattern drop = new Pattern("C:/Users/bhanawat_m/Pictures/img/drop.PNG");
Thread.sleep(2000);
screen.dragDrop(one, drop);