package xpath_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_google {

		public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("virat kohli");
		
		driver.findElement(By.className("gNO89b")).click();
		
		
		
	}
}
