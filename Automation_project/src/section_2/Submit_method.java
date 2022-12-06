package section_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit_method {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
			
			WebDriver driver  = new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			
			driver.manage().window().maximize();
			WebElement element =driver.findElement(By.xpath("//button[text()='✕']"));
		
			element.click();
			Thread.sleep(3000);
			WebElement element1 = driver.findElement(By.xpath("//input[@name='q']"));
			element1.sendKeys("I-phone11");
			Thread.sleep(3000);
		//	driver.findElement(By.xpath("//button[@type='submit']")).click();
			element1.submit();
			Thread.sleep(2000);
			driver.close();
	}
}



