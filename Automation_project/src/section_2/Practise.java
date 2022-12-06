package section_2;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {

	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		
		WebElement element  = 	driver.findElement(By.xpath("//input[@name='password']"));
		element.sendKeys("admin123");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]")).click();
			Thread.sleep(3000);
		WebElement element1 =	driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]"));
		Thread.sleep(6000);
		element1.click();
		Thread.sleep(3000);
	//		Robot r  = new Robot();
	//		r.keyPress(KeyEvent.VK_DOWN);
	//		r.keyRelease(KeyEvent.VK_DOWN);
			driver.close();
	}
}






