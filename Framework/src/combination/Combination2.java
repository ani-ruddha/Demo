package combination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Combination2 {

	public static void main(String[] args) throws Exception {
		
		Combination1 com = new Combination1();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get(com.getDataFromProperties("url"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(com.getDataFromProperties("username"));		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(com.getDataFromProperties("password"));
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
//		driver.findElement(By.xpath("//input[@class='taskSearchField']")).sendKeys(com.getDataFromExcel("Sheet1", 0, 0));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@placeholder='Start typing name ...'])[1]")).sendKeys(com.getDataFromExcel("Sheet1", 0, 0));
		
	}
}
