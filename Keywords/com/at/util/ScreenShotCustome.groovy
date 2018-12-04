package com.at.util

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.image.BufferedImage

import javax.imageio.ImageIO

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.sun.org.apache.bcel.internal.generic.RETURN

import internal.GlobalVariable
import ru.yandex.qatools.ashot.AShot
import ru.yandex.qatools.ashot.Screenshot
import ru.yandex.qatools.ashot.comparison.ImageDiff
import ru.yandex.qatools.ashot.comparison.ImageDiffer

public class ScreenShotCustome {
	@Keyword
	public void takeWebElementScreenshot(TestObject object) {
		WebElement element = WebUiCommonHelper.findWebElement(object, 10)
		WebDriver driver =  DriverFactory.getWebDriver()

		Screenshot screenshot = new AShot().takeScreenshot(driver, element)
		ImageIO.write(screenshot.getImage(),"PNG", new File("D:\\Demo\\KatalonDemo\\img\\Example.png"))
	}

	@Keyword
	public Boolean compareimages(TestObject object) {
		WebElement element = WebUiCommonHelper.findWebElement(object, 10)
		WebDriver driver =  DriverFactory.getWebDriver()

		BufferedImage expectedimage = ImageIO.read(new File("D:\\Demo\\KatalonDemo\\img\\Example.png"))
		Screenshot logoimagescreenshot = new AShot().takeScreenshot(driver, element)
		BufferedImage actualimage = logoimagescreenshot.getImage()

		ImageDiffer ImgDiff = new ImageDiffer()

		ImageDiff Diff = ImgDiff.makeDiff(expectedimage, actualimage)

		return Diff.hasDiff()
	}
}
