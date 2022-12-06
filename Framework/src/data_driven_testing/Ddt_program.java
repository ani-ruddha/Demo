package data_driven_testing;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ddt_program {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("D:\\Selenium folder\\LoginCredentials.properties");
		
		Properties pobj = new Properties();
		
		pobj.load(fis);
		
		String authorsname = pobj.getProperty("author'sname");
		String browser = pobj.getProperty("browser");
		String username = pobj.getProperty("username");
		String password = pobj.getProperty("password");
		String url = pobj.getProperty("url");
		
		System.out.println("author's name@ : " + authorsname);
		System.out.println("browser : " + browser);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
		System.out.println("url : " + url);
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.className("initial")).click(); 		
	
	}
}
