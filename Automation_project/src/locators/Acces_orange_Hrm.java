package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acces_orange_Hrm {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		//for user name
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(2000);
		//for password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(2000);
		//for login
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(4000);
		
		driver.close();
		
	}
}
