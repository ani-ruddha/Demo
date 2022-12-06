package pop_up_handling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W_PopUp_handling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		WebElement element = 	driver.findElement(By.xpath("//input[@type='text']"));
		
		element.sendKeys("i phone 11");
		
		element.submit();
	
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		
	String parentid = 	driver.getWindowHandle();
	
	Set<String> allId = driver.getWindowHandles();
	
	for(String cid : allId)
	{
		if(!parentid.equals(cid))
		{
			driver.switchTo().window(cid);
		}
	}
	
	String textvalue = driver.findElement(By.xpath("//span[text() ='APPLE iPhone 11 (Black, 128 GB)']")).getText();
		
		System.out.println("child window text value is : " + textvalue);
	}
}
