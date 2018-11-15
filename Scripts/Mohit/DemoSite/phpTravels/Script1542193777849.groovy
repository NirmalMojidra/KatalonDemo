import org.openqa.selenium.By as By
import org.openqa.selenium.Point as Point
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser(null, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow()

WebDriver driver = DriverFactory.getWebDriver()

driver.get("https://www.phptravels.net/")


//Actions action = new Actions(driver)
for (int i = 0; i < 1000; i++) {
    try {
        driver.findElement(By.className('text-center')).isDisplayed()

        break
    }
    catch (Exception e) {
        Thread.sleep(1000)
    } 
}

List<WebElement> elements = driver.findElements(By.className('text-center'))

for (WebElement webElement : elements) {
    String Title = webElement.getAttribute('title')

    if (Title.equals('Flights')) {
        webElement.click()

        break
    }
}

for (int i = 0; i < 1000; i++) {
    try {
        driver.findElement(By.id('flights')).isDisplayed()

        Thread.sleep(1000)

        break
    }
    catch (Exception e) {
        Thread.sleep(1000)
    } 
}

Actions action = new Actions(driver)

elements = driver.findElements(By.className('select2-chosen'))

for (WebElement webElement : elements) {
    Point loc = webElement.getLocation()

    if ((loc.getX() == 0) || (loc.getY() == 0)) {
        continue
    }
	if(webElement.getText().equals("Enter City Or Airport") == false){
		continue
	}
    
    action.moveToElement(webElement).click().perform()

    Thread.sleep(2000)

    action.moveByOffset(loc.getX(), loc.getY()).sendKeys('pun').perform()

    Thread.sleep(2000)

    driver.findElements(By.className('select2-result')).get(0).click()
}