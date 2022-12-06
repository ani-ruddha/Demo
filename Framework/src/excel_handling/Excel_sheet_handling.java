package excel_handling;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Excel_sheet_handling {

	public static void main(String[] args) throws Exception {		
		FileInputStream fis = new FileInputStream("D:\\Selenium folder\\DataEntry.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sh = book.getSheet("Sheet1");		
		Row r = sh.getRow(3);		
		Cell c = r.getCell(2);
/*	String value =	sh.getRow(2).getCell(1).getStringCellValue(); Code optimization*/
	String value = 	c.getStringCellValue();	
	System.out.println(value);
	}
}
