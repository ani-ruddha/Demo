package xpath_programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_webElements {

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
	
	ChromeDriver driver  = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone-11");
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	List<WebElement> allProduct= 	driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	
	List<WebElement> allprice = driver.findElements(By.xpath("//div[@class='_4rR01T']/../../div[2]/div/div/div[@class='_30jeq3 _1_WHN1']"));
	
	for(int i = 0 ; i<=allProduct.size()-1 ; i++)
	{
		System.out.println(allProduct.get(i).getText() + "-------------------->" + allprice.get(i).getText());
	}
}
}
