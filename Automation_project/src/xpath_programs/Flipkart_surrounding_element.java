package xpath_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_surrounding_element {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
			
			ChromeDriver driver  = new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone-11");
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
				
			Thread.sleep(3000);
			
			List<WebElement> lst = driver.findElements(By.xpath("//div[text()='APPLE iPhone 11 (Black, 64 GB)']"));
			Thread.sleep(10000);
			for(WebElement a : lst)
			{
				System.out.println(a.getText());
				
			}
			System.out.println();
//			String 	price = driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Black, 64 GB)']/../following-sibling::div/div/div/div[text()='₹46,999']")).getText();
//	
//		System.out.println(phonename + "-------> " + price);
//		
//		Thread.sleep(3000);
//		
//		driver.close();
	}
}
