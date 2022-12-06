package package_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abcd {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("iphone11");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class='L0Z3Pu']")).click();
	}
}
