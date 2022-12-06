package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_automate {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("I-phone11");
		
		driver.findElement(By.cssSelector("button[class='L0Z3Pu']")).click();
		
		String title = driver.getTitle();
		
		System.out.println("title of the webpage is : " + title);
		
		driver.close();
	}
}
