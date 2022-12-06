package section_2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class New_application {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.opencart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//a[text()='Register'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ani" , Keys.TAB , "Das" , Keys.TAB , "aniruddhadas919@gmail.com");
	WebElement element =	driver.findElement(By.xpath("//select[@name='country_id']"));
	element.click();
	
	List<WebElement> elements =	driver.findElements(By.xpath(""));
	
	
	
	
		
//		Select s = new Select(element);
		
//		s.selectByValue("99");
//		
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("AbcdXyz");
//		
//		driver.findElement(By.xpath("(//button[text()='Register'])[1]"));
		
		
	
		
		
		
		
		
		
	}
}
