package keyword_driven;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Phase1 {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		FileInputStream fis = new FileInputStream("D:\\Selenium folder\\Actitime_credentials.properties");
		
		Properties pobj = new Properties();
		
		pobj.load(fis);
		
	String Authorname = 	pobj.getProperty("authorname");
	String browser =		pobj.getProperty("browser");
	String username =		pobj.getProperty("username");
	String password =		pobj.getProperty("password");
	String url =			pobj.getProperty("url");
	
	System.out.println(Authorname);
	System.out.println(browser);
	System.out.println(username);
	System.out.println(password);
	System.out.println(url);
	
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
	
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
	driver.findElement(By.xpath("//a[text()='Logout']")).click();

							
							
		
	}
}







