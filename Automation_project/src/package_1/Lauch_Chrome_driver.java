package package_1;
import org.openqa.selenium.chrome.ChromeDriver;
public class Lauch_Chrome_driver {
	public static void main(String[] args) {
		//configuration of Chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
	
		//launch chrome driver
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		//to print the title of the webpage
		
	   String title = driver.getTitle();
	
	   System.out.println("web page title is : " + title);
	
		//to print the cuurent web-page url
		String url =driver.getCurrentUrl();
		
		System.out.println("Latest url is : " + url);
	
	}
}
