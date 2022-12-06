package special_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.msn.com/en-in/");
		Thread.sleep(3000);
		WebElement element1 =	driver.findElement(By.cssSelector("entry-point[instance-id='EntryPointHpWC']"));

		SearchContext sc = 	element1.getShadowRoot();
		Thread.sleep(3000);
		WebElement element2 = sc.findElement(By.cssSelector("div[class='default-feed-nav-container']>feed-navigation-hp[instance-id='FeedNavigationHp']"));
	
		SearchContext sc1 = element2.getShadowRoot();
		Thread.sleep(3000);
	WebElement element3 = 	sc1.findElement(By.cssSelector("feed-navigation[role='navigation']"));
		
	SearchContext sc2 =	element3.getShadowRoot();
		Thread.sleep(7000);
		WebElement element4 =	sc2.findElement(By.cssSelector("feed-navigation-item[id='entertainment']"));
		Thread.sleep(3000);
		element4.click();
	
	}
}
