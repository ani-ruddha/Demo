package actitime_custom_login;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Program1 {

	ChromeDriver driver;
	public static void main(String[] args) throws Exception {
		
		Program1 p1 = new Program1();
		
		p1.launchBrowser();
		
		Thread.sleep(2000);
		
		p1.loginCredentials();
		
		Thread.sleep(3000);
		
		p1.performTask();
		
	}
	//launching browsers
		public void launchBrowser()
		{
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 //implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 //explicit wait
		 
		 WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
		 
		 wait.until(ExpectedConditions.titleContains("Enter"));
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		}
		//all the login credentials
		public void loginCredentials()
		{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.className("initial")).click(); 
		}
		//performing the operation
		public void performTask() throws InterruptedException
		{
			
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("Kahani");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Product Description']")).sendKeys("Apple");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='components_button withPlusIcon']")).click();
		Thread.sleep(3000);
		String actual =	driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']")).getText();
		
		String expected = "Kahani";
		
		if(actual.equals(expected))
		{
			System.out.println("created successfully");
		}
		
		else
		{
			System.err.println("not created successfully");
		}}	
		
	}

