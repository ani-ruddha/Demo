package section_2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List_box_handling_normal_approach {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
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
			
			Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[3]")).click();
			
		
			
			Thread.sleep(2000);
									
			WebElement element1= driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[2]"));
			
			

			element1.click();
//			Thread.sleep(6000);
//			element1.sendKeys(Keys.PAGE_DOWN);
//			element1.sendKeys(Keys.PAGE_DOWN);
//			element1.sendKeys(Keys.PAGE_DOWN);
//			element1.sendKeys(Keys.PAGE_DOWN);

			
			
			/*findeelement approach
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//option[text()='CAN - Personal']")).click();
			*/
			
			//with the HELP OF KEYBOARD STROKE(ROBOT CLASS)
			
//			Robot r = new Robot();
//			
//			r.keyPress(KeyEvent.VK_PAGE_DOWN);
//			r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//			
//			r.keyPress(KeyEvent.VK_ENTER);
//			r.keyRelease(KeyEvent.VK_ENTER);
			
//			r.keyPress(KeyEvent.VK_PAGE_DOWN);
//			r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//			
//			r.keyPress(KeyEvent.VK_PAGE_DOWN);
//			r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//			
//			r.keyPress(KeyEvent.VK_PAGE_DOWN);
//			r.keyRelease(KeyEvent.VK_PAGE_DOWN);
			
			/*
			 * r.keyPress(KeyEvent.VK_ENTER); r.keyRelease(KeyEvent.VK_ENTER);
			 */
			

			
			
			
		//	Thread.sleep(4000);
			//driver.close();
	}
}
