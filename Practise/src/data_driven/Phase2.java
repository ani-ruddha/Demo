package data_driven;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Phase2 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("D:\\Selenium folder\\DataEntry.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet1");
		
//		Row r = sh.getRow(4);
//		
//		Cell c = r.getCell(1);
//		
//		String data = c.getStringCellValue();
		
	String data = 	sh.getRow(4).getCell(1).getStringCellValue();
		
		System.out.println(data);
	}
}








