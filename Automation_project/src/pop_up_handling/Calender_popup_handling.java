package pop_up_handling;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_popup_handling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
	//	driver.get("https://www.redbus.in/");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();		
		Calendar cal = Calendar.getInstance();	
		 cal.add(Calendar.DAY_OF_MONTH, 1);	//TO fetch tomorrow's date
		Date d1 = 	cal.getTime();
		System.out.println(d1);
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
		
		String formatDate = sdf.format(d1);
	
		System.out.println(formatDate);
		
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys(formatDate , Keys.ENTER);
		driver.findElement(By.xpath("(//input[@class='db'])[3]")).sendKeys(formatDate,Keys.ENTER);
		driver.findElement(By.xpath("//td[@class='current day']")).click();
		
		
		
	}
}
