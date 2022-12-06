package special_cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowRoot_by_Java {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.msn.com/en-in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	WebElement entry = 	driver.findElement(By.xpath("//entry-point[@instance-id='EntryPointHpWC']"));
	
	SearchContext entry1 =	entry.getShadowRoot();
	Thread.sleep(3000);
	WebElement child1 = entry1.findElement(By.cssSelector("div.default-feed-nav-container>feed-navigation-hp[instance-id='FeedNavigationHp']"));
	
				SearchContext ch = child1.getShadowRoot();
				Thread.sleep(3000);
	WebElement child2 = 		ch.findElement(By.cssSelector("feed-navigation[role='navigation']"));
	
	SearchContext ch1 =	child2.getShadowRoot();
	Thread.sleep(3000);
	WebElement child3 = ch1.findElement(By.cssSelector("feed-navigation-item[id='entertainment']"));
	Thread.sleep(3000);
	child3.click();
		
	
	}
}
