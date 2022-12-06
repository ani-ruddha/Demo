package package_1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_morzilla_driver {

	public static void main(String[] args) {
		//configuration of firefox
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium folder\\geckodriver.exe");
		
		//launching firefox
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
	}
}
