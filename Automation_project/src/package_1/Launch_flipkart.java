package package_1;
import org.openqa.selenium.chrome.ChromeDriver;
public class Launch_flipkart {
	public static void main(String[] args) throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://www.flipkart.com/");

		/*for maximization*/
		driver.manage().window().maximize();		
		Thread.sleep(3000);	

		/*for minimization*/		
		driver.manage().window().minimize();		
		Thread.sleep(5000);
		driver.close();
		
	}
}
