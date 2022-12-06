package excel_handling;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Alldata {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream("D:\\Selenium folder\\DataEntry.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sh = book.getSheet("Sheet1");
		
		DataFormatter format  = new DataFormatter();
		
		
		
		for(int i = 0 ; i<=sh.getLastRowNum() ; i++)
		{
			Row r  = sh.getRow(i);
			
			for(int j = 0 ; j<=r.getLastCellNum(); j++)
			{
			String allValues = 	format.formatCellValue(r.getCell(j));
				
				System.out.println(allValues);
			}
		}
	}
}
