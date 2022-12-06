package pom_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regular_class {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
	WebElement element = 	driver.findElement(By.xpath("//input[@name='username']"));
	
	element.sendKeys("admin");
	Thread.sleep(3000);
	Navigation nav = driver.navigate();
	
	nav.refresh();
	
	element.sendKeys("admin");
	}
}
