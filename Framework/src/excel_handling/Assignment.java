package excel_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/railways/");
		
		driver.manage().window().maximize();
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(6000);
		WebElement element =driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		
		element.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin ']/div/input")).sendKeys("Delhi");
		Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//p[@class='searchedResult font14 darkText']/..)[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin ']/div/input")).sendKeys("Lucknow");
		
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();
	
	Thread.sleep(3000);
	/*AS per the question 20th May is not visible in Calander so to perform the scenario I'VE taken some other date*/
	driver.findElement(By.xpath("(//div[text()='21'])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//ul[@class='travelForPopup']/li[@data-cy='3A']")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[@data-cy='submit']")).click();
	
	Thread.sleep(3000);
	driver.close();
	
	
	
	}
}
