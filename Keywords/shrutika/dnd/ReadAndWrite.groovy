package shrutika.dnd

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
			List<String> list = new ArrayList<String>()
			for(def j:(0..colUpTo)) {
				String cell = sh.getRow(rowToFetchData).getCell(j).getStringCellValue();
				list.add(cell)
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
