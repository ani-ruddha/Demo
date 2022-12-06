package pop_up_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Pop_Up_handling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Frames'])[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='org.openqa.selenium'])[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Alert'])[1]")).click();		
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame(2);		
		Thread.sleep(3000);
		String name = 	driver.findElement(By.xpath("//h2[text()='Interface Alert']")).getText();		
		System.out.println(name);		
	}
}
