package execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listners.Listnerclass.class)
public class Base_class_for_users extends Base_class {

	@Test
	public void execution()
	{
		driver.findElement(By.xpath("//div[@id='contars']")).click();
	}
	
}
