package shrutika.dnd

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

public class ReadAndWrite {

	XSSFWorkbook wb;
	 
	@Keyword
	public List<Object> readData(String path,int row,int col) {
		FileInputStream fis = new FileInputStream(new File(path))
		XSSFWorkbook wb = new XSSFWorkbook(fis)
		XSSFSheet sh = wb.getSheetAt(0)
		List<String> list = new ArrayList<String>()
			for(def j:(0..col)) 
			{
				String cell = sh.getRow(row).getCell(j).getStringCellValue();
				list.add(cell)
			}
		fis.close()
		return list;
	}
	
	@Keyword
	public void writeData(String path, List<Object> list)
	{
		FileOutputStream fos = new FileOutputStream(new File(path))
		XSSFSheet sh1 = wb.createSheet("test")
		sh1.createRow(0)
		for(int i=0; i<=2; i++)s
		sh1.getRow(0).createCell(i).setCellValue(list.get(i))
		wb.write(fos)
		fos.close;
	}
}
