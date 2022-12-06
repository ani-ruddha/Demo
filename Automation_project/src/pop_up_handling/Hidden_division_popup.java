package pop_up_handling;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hidden_division_popup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.className("initial")).click(); 		
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();	
		driver.findElement(By.xpath("(//div[@class='checkbox inactive'])[1]")).click();		
		driver.findElement(By.xpath("//div[@class='delete button']")).click();		
		//explicit wait we are using because it is not executing with help of implicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'You are about to delete')]")));
		String deleltemsg = driver.findElement(By.xpath("//div[contains(text(),'You are about to delete')]")).getText();
		
		System.out.println("delete msg is : " + deleltemsg);
	}
}
