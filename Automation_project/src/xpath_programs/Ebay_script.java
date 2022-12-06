package xpath_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay_script {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nike shoes");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(4000);
	String result = driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']")).getText();
	
	System.out.println("result is : " + result);
	
	driver.close();
	}
}
