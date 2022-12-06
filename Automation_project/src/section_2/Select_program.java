package section_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_program {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/JSPIDERS/Desktop/Select.html");
		
	WebElement element = 	driver.findElement(By.xpath("//select[@id='abc']"));
	
		element.click();
		
//		driver.findElement(By.xpath("//option[text()='Bahubali']")).click();
		
		Select s = new Select(element);
		
		s.selectByVisibleText("Bahubali");
//		if(s.isMultiple())
//		{
//			System.out.println("list box is multiple");
//		}
//		else
//		{
//			System.out.println("list box is not multiple");
//		}
//		List<WebElement> lst = s.getOptions();
//		
//		for(WebElement all : lst)
//		{
//			System.out.println(all.getText());
//		}
	}
}
