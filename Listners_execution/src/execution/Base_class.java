package execution;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Base_class {
	public static WebDriver driver;
	public DataUtility_class duc = new DataUtility_class();	
	@BeforeClass(alwaysRun = true)
	public void launchBrowser() throws Exception
	{
		driver= new ChromeDriver();		
		driver.get(duc.getDataFromProperties("url"));		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod(alwaysRun = true)
	public void loginCredentials() throws Exception
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(duc.getDataFromProperties("username"));
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(duc.getDataFromProperties("password"));
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}	

	@AfterMethod(alwaysRun = true)
	public void logOut()
	{
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}	
	@AfterClass(alwaysRun = true)
	public void closeBrowser()
	{
		driver.close();
	}
	
}
