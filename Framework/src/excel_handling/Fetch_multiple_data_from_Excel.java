package excel_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_multiple_data_from_Excel {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("D:\\Selenium folder\\DataEntry.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sh = book.getSheet("Sheet1");
		
		DataFormatter format = new DataFormatter();
		
		int lastrow =	sh.getLastRowNum();
		for(int i =1 ; i<=lastrow ; i++)
		{
	//	String values = 	format.formatCellValue(sh.getRow(i).getCell(1));
			
			Row r = sh.getRow(i);
			
			for(int j = 1 ; j<=r.getLastCellNum() ; j++)
			{
				String values = format.formatCellValue(sh.getRow(i).getCell(j));
				
				System.out.println(values);
			}
		}
	}
}
