import org.openqa.selenium.By as By
import org.openqa.selenium.Point as Point
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(null, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow()

WebDriver driver = DriverFactory.getWebDriver()

driver.get('https://www.phptravels.net/')

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
    
    if (webElement.getText().equals('Enter City Or Airport') == false) {
        continue
    }
    
    action.moveToElement(webElement).click().perform()

    Thread.sleep(2000)

    action.moveByOffset(loc.getX(), loc.getY()).sendKeys('pun').perform()

    Thread.sleep(2000)

    driver.findElements(By.className('select2-result')).get(0).click()
}

    driver.findElement(By.name('departure')).click()

    Thread.sleep(1000)

    elements = driver.findElements(By.className('day'))

    for (WebElement webElement : elements) {
        if (webElement.getText().equals('18')) {
            webElement.click()

            Thread.sleep(1000)

            break
        }
    }
    
    elements = driver.findElements(By.className('pfb0'))

    for (WebElement webElement : elements) {
        System.out.println(webElement.getText())

        if (webElement.getText().equals('SEARCH')) {
            webElement.click()
        }
    }
    
    for (int i = 0; i < 1000; i++) {
        try {
            driver.findElement(By.id('bookbtn')).isDisplayed()

            Thread.sleep(1000)

            break
        }
        catch (Exception e) {
            Thread.sleep(1000)
        } 
    }
    
    driver.findElements(By.id('bookbtn')).get(0).click()

    for (int i = 0; i < 1000; i++) {
        try {
            driver.findElement(By.name('firstname')).isDisplayed()

            Thread.sleep(1000)

            break
        }
        catch (Exception e) {
            Thread.sleep(1000)
        } 
    }
    
    driver.findElement(By.name('firstname')).sendKeys('Firstname')

    driver.findElement(By.name('lastname')).sendKeys('LastName')

    driver.findElement(By.name('email')).sendKeys('dummyemail@email.com')

    driver.findElement(By.name('confirmemail')).sendKeys('dummyemail@email.com')

    driver.findElement(By.name('phone')).sendKeys('9874563201')

    driver.findElement(By.name('address')).sendKeys('Dummy Address')
	
	elements = driver.findElements(By.className("btn-success"));
	for (WebElement webElement : elements) {
		if(webElement.getText().equals("CONFIRM THIS BOOKING")) {
			webElement.click();
		}
	}
	
	for (int i = 0; i < 1000; i++) {
		try {
			driver.findElement(By.className("arrivalpay")).isDisplayed();
			Thread.sleep(1000);
			break;
		} catch (Exception e) {
			Thread.sleep(1000);
		}
	}
	
	driver.findElement(By.className("arrivalpay")).click();
	Thread.sleep(1000);
	driver.switchTo().alert().accept();

