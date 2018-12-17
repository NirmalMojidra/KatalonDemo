package com.at.util

import java.awt.image.BufferedImage
import java.text.SimpleDateFormat

import javax.imageio.ImageIO

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory

import ru.yandex.qatools.ashot.AShot
import ru.yandex.qatools.ashot.Screenshot
import ru.yandex.qatools.ashot.comparison.ImageDiff
import ru.yandex.qatools.ashot.comparison.ImageDiffer

public class ScreenShotCustome {
	@Keyword
	public void takeWebElementScreenshot(TestObject object) {
		WebElement element = WebUiCommonHelper.findWebElement(object, 10)
		WebDriver driver =  DriverFactory.getWebDriver()

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("DD_MM_YYYY_HH_MM_SS");
		String TS = sdf.format(date);

		def username = System.getProperty("user.name");
		def File_Path = ("C://Users//" + username + "//git//KatalonDemo//Include//img//" + TS + ".png")

		Screenshot screenshot = new AShot().takeScreenshot(driver, element)
		ImageIO.write(screenshot.getImage(),"PNG", new File(File_Path))
	}

	@Keyword
	public Boolean compareimages(TestObject object) {
		WebElement element = WebUiCommonHelper.findWebElement(object, 10)
		WebDriver driver =  DriverFactory.getWebDriver()

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("DD_MM_YYYY_HH_MM_SS");
		String TS = sdf.format(date);

		def username = System.getProperty("user.name");
		def File_Path = ("C://Users//" + username + "//git//KatalonDemo//Include//img//" + TS + ".png")

		Screenshot logoimagescreenshot = new AShot().takeScreenshot(driver, element)
		ImageIO.write(logoimagescreenshot.getImage(),"PNG", new File(File_Path))
		BufferedImage expectedimage = ImageIO.read(new File(File_Path))


		BufferedImage actualimage = logoimagescreenshot.getImage()

		ImageDiffer ImgDiff = new ImageDiffer()

		ImageDiff Diff = ImgDiff.makeDiff(expectedimage, actualimage)

		return Diff.hasDiff()
	}
}
