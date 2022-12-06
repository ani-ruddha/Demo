package section_2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_handling {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		WebElement element = 	driver.findElement(By.xpath("//input[@type='text']"));
		
		element.sendKeys("i phone 11");
		
		element.submit();
		
		Robot r  = new Robot();
		
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);		
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);		
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);		
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);

		r.keyPress(KeyEvent.VK_PAGE_DOWN);		
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);		
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
	}
}
