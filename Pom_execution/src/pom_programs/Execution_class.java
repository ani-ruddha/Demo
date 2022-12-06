package pom_programs;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
public class Execution_class {
	public static void main(String[] args) throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");		
		WebDriver driver  = new ChromeDriver();		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Pom_class pom = new Pom_class(driver);		
		pom.login("admin", "manager");		
		Navigation nav = driver.navigate();		
		nav.refresh();
		Thread.sleep(5000);
		pom.login("admin", "manager");
		
	}
}
