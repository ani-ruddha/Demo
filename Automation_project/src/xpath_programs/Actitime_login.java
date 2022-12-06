package xpath_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_login {

	public static void main(String[] args) throws Exception {
		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		WebElement element  = driver.findElement(By.xpath("//input[@name='username']"));
		
		element.sendKeys("admin1234");
		Thread.sleep(3000);
		element.clear();
		Thread.sleep(2000);
		
		element.sendKeys("admin");
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
	}
}
