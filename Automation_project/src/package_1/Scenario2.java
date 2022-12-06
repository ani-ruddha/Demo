package package_1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getPageSource());
		
		driver.manage().window().minimize();
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(40,200));
		
		Thread.sleep(4000);
		
		driver.manage().window().setPosition(new Point(40, 50));
		
		driver.close();
		
		
	}
}
