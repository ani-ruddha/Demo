package xpath_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_multiple_att_visible {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone-11");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[13]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[36]")).click();
		
		Thread.sleep(3000);
		driver.close();
		
	}
}
