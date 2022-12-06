package package_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_myntra {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://myntra.com/");
		
		String title = driver.getTitle();
		
		System.out.println("title is : " + title);
		
		String url = driver.getCurrentUrl();
		
		System.out.println("current url is : " + url);
	}
}
