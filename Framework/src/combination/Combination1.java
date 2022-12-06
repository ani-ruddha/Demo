package combination;

import java.io.FileInputStream;

import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Combination1 {

	public String getDataFromProperties(String data) throws Exception
	{
		FileInputStream fis = new FileInputStream("D:\\Selenium folder\\Actitime_credentials.properties");
		
		Properties pobj = new Properties();
		
		pobj.load(fis);
		
		return pobj.getProperty(data);
			
	}
	
	public String getDataFromExcel(String sheet , int row , int cell) throws Exception
	{
		FileInputStream  fis = new FileInputStream("D:\\Selenium folder\\DataEntry.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheet);
		DataFormatter format  = new DataFormatter();
		
	String value =	format.formatCellValue(sh.getRow(row).getCell(cell));
	
	return value;
		
		
	}
}
