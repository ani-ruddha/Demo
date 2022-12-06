package regular_classs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execution_practise_class {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		Pom_class_practise p = new Pom_class_practise(driver);
		
		p.login("admin", "manager");
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		p.login("admin", "manager");
		
	}
}
