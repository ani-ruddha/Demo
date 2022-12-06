package package_1;
/*to set the new dimesion or Resize of Browser*/
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class Scenario1 {

	public static void main(String[] args) throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://www.flipkart.com/");		
		driver.manage().window().maximize();		
		Thread.sleep(3000);		
		Dimension d1 = new Dimension(100, 700);
		driver.manage().window().setSize(d1);
		/*			or
		 * driver.manage().window().setSize(new Dimension(100 , 700));
		 * */
		Thread.sleep(4000);
		/*Relocation of browser*/
		Point p1 = new Point(100, 400);
		driver.manage().window().setPosition(p1);
	/*						or
	 * 	driver.manage().window().setPosition(new Point(100 , 400));
	 */
	}
}
