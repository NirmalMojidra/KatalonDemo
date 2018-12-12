package shrutika.dnd
import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.FormulaEvaluator
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords


class ReadAndWrite {
	/**
	 * Refresh browser
	 */
	@Keyword
	def refreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}

	/**
	 * Click element
	 * @param to Katalon test object
	 */
	@Keyword
	def clickElement(TestObject to) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			KeywordUtil.logInfo("Clicking element")
			element.click()
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */
	@Keyword
	def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
		WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
		return selectedRows
	}
	
	XSSFWorkbook wb
	FileInputStream fis
	FileOutputStream fos

	@Keyword
	public List<Object> readData(String path,int rowToFetchData,int colUpTo) {
		try{
			fis = new FileInputStream(new File(path))
			XSSFWorkbook wb = new XSSFWorkbook(fis)
			XSSFSheet sh = wb.getSheetAt(0)
			FormulaEvaluator eval = wb.getCreationHelper().createFormulaEvaluator()
			List<String> list = new ArrayList<String>()

			for(def col:(0..colUpTo-1)) {
				Cell cell= sh.getRow(rowToFetchData).getCell(col)
				println(cell)
				switch(eval.evaluateInCell(cell).getCellType()){

					case 0:
						Object a = sh.getRow(rowToFetchData).getCell(col).getNumericCellValue()
						list.add(a)
						break
					case 1:
						Object a = sh.getRow(rowToFetchData).getCell(col).getStringCellValue()
						list.add(a)
						break
					default:
						break
				}
			}
			fis.close()
			return list;
		}
		catch(Exception e) {
			println (e.message)
			println(e.printStackTrace())
		}
	}

	@Keyword
	public void writeData(String path, List<Object> list, int colUpTo) {
		try{
			fis = new FileInputStream(new File(path))
			XSSFWorkbook wb = new XSSFWorkbook(fis)
			XSSFSheet sh1 = wb.createSheet("test")
			sh1.createRow(0)
			for(int i=0; i<=colUpTo-1; i++)
				sh1.getRow(0).createCell(i).setCellValue(list.get(i))

			fos = new FileOutputStream(new File(path))
			wb.write(fos)
		}
		catch(Exception e) {
			println (e.message)
			println(e.printStackTrace())
		}
	}
}