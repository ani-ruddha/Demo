package section_2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script_Executor {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		WebElement element = 	driver.findElement(By.xpath("//input[@type='text']"));
		
		element.sendKeys("i phone 11");
		
		element.submit();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,6000);");
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}
}




