package utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base_class_for_group_execution {

	public WebDriver driver;
	public Data_utitlity_class duc = new Data_utitlity_class();
	
	@BeforeClass(alwaysRun = true)
	public void launchBrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(duc.getDatafromProperties("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@BeforeMethod(alwaysRun = true)
	public void login() throws Exception
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(duc.getDatafromProperties("username"));
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(duc.getDatafromProperties("password"));
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}
	@AfterMethod(alwaysRun = true)
	public void logout()
	{
		driver.findElement(By.xpath("//div[@id='container_reports']")).click();
	}
	@AfterClass(alwaysRun = true)
	public void closeBrowser()
	{
			driver.close();
	}
}
