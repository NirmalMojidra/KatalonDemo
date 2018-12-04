import org.openqa.selenium.By as By
import org.openqa.selenium.Point as Point
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser("https://www.phptravels.net/")

WebUI.maximizeWindow()
//Initializing Selenium WebDriver
WebDriver driver = DriverFactory.getWebDriver()

for (int i = 0; i < 1000; i++) {
    try {
        driver.findElement(By.className('text-center')).isDisplayed()
		Thread.sleep(1000)
        break
    }
    catch (Exception e) {
        Thread.sleep(1000)
    } 
}

List<WebElement> elements = driver.findElements(By.className('text-center'))
//Click on Flights Tab
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
//Populating data in Source and destination field
for (WebElement webElement : elements) {
    Point loc = webElement.getLocation()

    if ((loc.getX() == 0) || (loc.getY() == 0)) {
        continue
    }
    
    if (webElement.getText().equals('Enter City Or Airport') == false) {
        continue
    }
    
    action.moveToElement(webElement).click().perform()

    Thread.sleep(500)

    action.moveByOffset(loc.getX(), loc.getY()).sendKeys(City_To_From).perform()

    Thread.sleep(2000)

    driver.findElements(By.className('select2-result')).get(0).click()
}
//Populating journey date
driver.findElement(By.name('departure')).click()

Thread.sleep(1000)

elements = driver.findElements(By.className('day'))

for (WebElement webElement : elements) {
    if (webElement.getText().equals(Travel_Date)) {
        webElement.click()

        Thread.sleep(500)

        break
    }
}
//Click on Search Button
elements = driver.findElements(By.className('pfb0'))

for (WebElement webElement : elements) {
    System.out.println(webElement.getText())

    if (webElement.getText().equals('SEARCH')) {
        webElement.click()
    }
}
//wait for page to load
for (int i = 0; i < 1000; i++) {
    try {
        driver.findElement(By.id('bookbtn')).isDisplayed()

        Thread.sleep(500)

        break
    }
    catch (Exception e) {
        Thread.sleep(1000)
    } 
}
//Click on Book now Button
driver.findElements(By.id('bookbtn')).get(0).click()

for (int i = 0; i < 1000; i++) {
    try {
        driver.findElement(By.name('firstname')).isDisplayed()

        Thread.sleep(500)

        break
    }
    catch (Exception e) {
        Thread.sleep(1000)
    } 
}
//Enter passenger details
driver.findElement(By.name('firstname')).sendKeys('Firstname')

driver.findElement(By.name('lastname')).sendKeys('LastName')

driver.findElement(By.name('email')).sendKeys('dummyemail@email.com')

driver.findElement(By.name('confirmemail')).sendKeys('dummyemail@email.com')

driver.findElement(By.name('phone')).sendKeys('9874563201')

driver.findElement(By.name('address')).sendKeys('Dummy Address')

elements = driver.findElements(By.className('btn-success'))
//Click on Confirm button
for (WebElement webElement : elements) {
    if (webElement.getText().equals('CONFIRM THIS BOOKING')) {
        webElement.click()
    }
}

for (int i = 0; i < 1000; i++) {
    try {
        driver.findElement(By.className('arrivalpay')).isDisplayed()

        Thread.sleep(500)

        break
    }
    catch (Exception e) {
        Thread.sleep(1000)
    } 
}
//Click on pop up
driver.findElement(By.className('arrivalpay')).click()

Thread.sleep(1000)

//Accept Alert
driver.switchTo().alert().accept()
