package utility_class_for_cross_browser;

import java.io.FileInputStream;

import java.util.Properties;

public class Data_utility_for_cross_browser {

	public String getDataFromProperties(String data) throws Exception
	{
		FileInputStream fis = new FileInputStream("D:\\Selenium folder\\Actitime_credentials.properties");
		
		Properties pobj = new Properties();
		
		pobj.load(fis);
		
		return pobj.getProperty(data);
		
	}
}
