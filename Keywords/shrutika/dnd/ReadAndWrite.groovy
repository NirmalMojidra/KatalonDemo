package shrutika.dnd

import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.FormulaEvaluator
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook

import com.kms.katalon.core.annotation.Keyword

public class ReadAndWrite {

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
		catch(Exception e)
		{
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
		catch(Exception e)
		{
			println (e.message)
			println(e.printStackTrace())
		}
	}
}
