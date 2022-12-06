package execution;
import java.io.FileInputStream;
import java.util.Properties;

public class DataUtility_class {

	public String getDataFromProperties(String data) throws Exception
	{
	FileInputStream fis = new FileInputStream("D:\\Selenium folder\\Actitime.properties");
	
	Properties pobj = new Properties();
	
	pobj.load(fis);
	
	return pobj.getProperty(data);
	}
}
