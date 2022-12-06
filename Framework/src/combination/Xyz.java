package combination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xyz {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demo.actitime.com/login.do");
		
String title =		driver.getTitle();
String url = driver.getCurrentUrl();

	System.out.println(title);
	System.out.println(url);
	
	driver.manage().window().minimize();
	
	Thread.sleep(4000);
	
	driver.manage().window().maximize();
	
	driver.navigate().back();
	
	String title2 = driver.getTitle();
	
	String url2 = driver.getCurrentUrl();
	
	
	System.out.println(title2);
	System.out.println(url2);
	
	
	driver.manage().window().minimize();
	
	driver.manage().window().maximize();
	
	driver.navigate().forward();
	
	driver.navigate().refresh();
	
	driver.close();
	
	
	
	
	}
}
