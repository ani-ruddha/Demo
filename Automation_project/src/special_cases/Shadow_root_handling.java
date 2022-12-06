package special_cases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import graphql.parser.antlr.GraphqlParser.ArgumentsContext;

public class Shadow_root_handling {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.msn.com/en-in/");
				
		JavascriptExecutor jse  = (JavascriptExecutor)driver;
		
	WebElement	element = (WebElement)jse.executeScript("document.querySelector('body > fluent-design-system-provider > entry-point').shadowRoot.querySelector('#entry-point-hp-wc-root-wrapper > div.content-container > div.feed-nav-container > div.default-feed-nav-container > feed-navigation-hp').shadowRoot.querySelector('div > feed-navigation').shadowRoot.querySelector('feed-navigation-item#entertainment')");
			
	Thread.sleep(3000);
	//String enter="arguments[0].setAttribute('value' ,)";
	
	((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
	
	
	}
}
