package xpath_programs;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Flipkart {
	public static void main(String[] args) throws InterruptedException {				
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone-11");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(text(),' Low to High')]")).click();
	//	driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
		driver.close();
	}
}
