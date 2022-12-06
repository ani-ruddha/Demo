package package2;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Another_way_to_access {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.flipkart.com/");
		
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.myntra.com/");
		  
		Navigation nav = driver.navigate();
		
		nav.back();
		
		Thread.sleep(2000);
		
		nav.forward();
		
		Thread.sleep(2000);
		
		nav.refresh();
		
		Thread.sleep(2000);
		
		driver.close();
	}
}
