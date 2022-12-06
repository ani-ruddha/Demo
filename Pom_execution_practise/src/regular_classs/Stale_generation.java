package regular_classs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale_generation {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	WebElement element = 	driver.findElement(By.xpath("//input[@name='username']"));
	
	element.sendKeys("admin");
	
	driver.navigate().refresh();
	
	element.sendKeys("admin");
	}
}
