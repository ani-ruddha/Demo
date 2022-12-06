package section_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Key_board_stroke_Keys {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		WebElement element = 	driver.findElement(By.xpath("//input[@name='username']"));
		
		element.sendKeys("admin",Keys.TAB ,"manager",Keys.ENTER);
	
		
		Thread.sleep(3000);
				
		driver.close();
		
		
		
		
		
	//	WebElement element1  = driver.findElement(By.xpath("//input[@name='pwd']"));
		
	//	element1.sendKeys("manager");
		
		
	}
}
