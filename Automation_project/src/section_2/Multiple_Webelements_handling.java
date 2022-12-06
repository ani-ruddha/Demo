package section_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Webelements_handling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		WebElement element = 	driver.findElement(By.xpath("//input[@type='text']"));
		
		element.sendKeys("i phone 11");
		
		element.submit();
		
		Thread.sleep(5000);
		List<WebElement> lst = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		Thread.sleep(4000);
		List<WebElement> lst1 = driver.findElements(By.xpath("//div[@class='_4rR01T']/../following-sibling::div/div/div/div[@class='_30jeq3 _1_WHN1']"));
	
		Thread.sleep(3000);
		
		for(int i = 1 ; i<=lst.size()-1; i++)
		{
			System.out.println(lst.get(i).getText()+"--------------" + lst1.get(i).getText());
		}
		
		driver.close();
		
			
	}
}
