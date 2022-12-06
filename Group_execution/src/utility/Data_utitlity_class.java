package utility;

import java.io.FileInputStream;
import java.util.Properties;


public class Data_utitlity_class {

	public String getDatafromProperties(String data) throws Exception
	{
		FileInputStream fis = new FileInputStream("D:\\Selenium folder\\Actitime_credentials.properties");
		
		Properties pobj = new Properties();
		
		pobj.load(fis);
		
		return pobj.getProperty(data);
	}
}
