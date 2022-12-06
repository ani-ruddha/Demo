package combination;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {

	public String getDataFromProperties(String data) throws Exception
	{
		FileInputStream fis = new FileInputStream("D:\\Selenium folder\\Actitime_credentials.properties");
		
		Properties pobj = new Properties();
		
		pobj.load(fis);
		return pobj.getProperty(data);
	}
	
	public String getDataFromExcel(String sheetno , int rownum ,int cellnum ) throws Exception
	{
		FileInputStream fis = new FileInputStream("D:\\Selenium folder\\DataEntry.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sh = book.getSheet(sheetno);
		
		DataFormatter format = new DataFormatter();
		
	String exceldata = 	format.formatCellValue(sh.getRow(rownum).getCell(cellnum));
	
	return exceldata;
	}
}











