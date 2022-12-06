package combination;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Frame2 {
	public static void main(String[] args) throws Exception {
		
		DataUtility f = new DataUtility();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get(f.getDataFromProperties("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
driver.findElement(By.xpath("//input[@name='username']")).sendKeys(f.getDataFromProperties("username"));		
driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(f.getDataFromProperties("password"));
driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
driver.findElement(By.xpath("//input[@class='taskSearchField']")).sendKeys(f.getDataFromExcel("Sheet1", 1, 1));
			
	
	}
}
