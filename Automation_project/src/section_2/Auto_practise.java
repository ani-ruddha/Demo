package section_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_practise {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
		
		element.sendKeys("virat kohli");
		
		Thread.sleep(3000);
		
		List<WebElement> element1 = driver.findElements(By.xpath("//div[@class='eIPGRd']"));
		
		for(WebElement elements : element1)
		{
			String s = elements.getText();
			
			if(s.contains("news"))
			{
				elements.click();
				break;
			}
		}
		
		driver.close();
	}
}
