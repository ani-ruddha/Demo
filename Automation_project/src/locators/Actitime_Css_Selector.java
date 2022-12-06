package locators; 
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_Css_Selector {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[id='keepLoggedInCheckBoxContainer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
