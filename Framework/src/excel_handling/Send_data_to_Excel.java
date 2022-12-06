package excel_handling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Send_data_to_Excel {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("D:\\Selenium folder\\DataEntry.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sh = book.getSheet("Sheet1");
		
		sh.createRow(0).createCell(1).setCellValue("player names");
		
		FileOutputStream fos = new FileOutputStream("D:\\Selenium folder\\DataEntry.xlsx");
		
		book.write(fos);
		
//		fos.flush();
		
		System.out.println("pass");
		
		
		
	}
}
