package package2;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
public class Opening_two_webpages {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(5000);
		
		driver.get("https://www.flipkart.com/");
		
		Navigation nav = driver.navigate();
		
		Thread.sleep(3000);
		/*to navigate to the previous web page*/
		nav.back();		
		Thread.sleep(3000);
		/*to navigate to the next web page*/
		nav.forward();		
		Thread.sleep(2000);
		
		/*to refresh to the web page*/
		nav.refresh();
		
		driver.close();
	}
}
