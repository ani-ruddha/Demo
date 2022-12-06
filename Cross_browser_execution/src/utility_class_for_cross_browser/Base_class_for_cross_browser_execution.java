package utility_class_for_cross_browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_class_for_cross_browser_execution {

	public WebDriver driver;
	public Data_utility_for_cross_browser duc = new Data_utility_for_cross_browser();
	
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchBrowser(String browser) throws Exception
	{
		if(browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		
		if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium folder\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get(duc.getDataFromProperties("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@BeforeMethod(alwaysRun = true)
	public void login() throws Exception
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(duc.getDataFromProperties("username"));
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(duc.getDataFromProperties("password"));
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
