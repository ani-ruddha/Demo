package section_2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slide_Action_handling {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
	//	driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		WebElement element = 	driver.findElement(By.xpath("//input[@type='text']"));
		
		element.sendKeys("i phone 11");
		
		element.submit();
		
		Thread.sleep(3000);
		JavascriptExecutor jsp =(JavascriptExecutor)driver;
		
		jsp.executeScript("window.scrollBy(0,200);");
		
		WebElement element1 = driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[2]"));
		
		WebElement element2 = driver.findElement(By.xpath("//div[@class='_3FdLqY']"));
		Thread.sleep(5000);
	
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(element1, -40, 0);
		act.perform();
		
		
		Thread.sleep(3000);
		
		act.dragAndDropBy(element2, 40, 0);
		act.perform();
		
	//	Thread.sleep(3000);
	//	driver.close();
	}
}
