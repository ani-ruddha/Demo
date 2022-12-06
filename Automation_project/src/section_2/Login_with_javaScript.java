package section_2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_with_javaScript {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("document.getElementById('username').value='admin';");
		Thread.sleep(3000);
		jse.executeScript("document.getElementsByName('pwd')[0].value='manager';");
		Thread.sleep(3000);
		jse.executeScript("document.getElementById('loginButton').click();");
	}
}
