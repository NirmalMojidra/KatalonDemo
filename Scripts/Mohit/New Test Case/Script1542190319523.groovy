import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://www.google.com')

Thread.sleep(5000)

WebUI.closeBrowser()