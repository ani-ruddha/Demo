package section_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop_scenario {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
	
		WebElement dragOslo = 	driver.findElement(By.xpath("(//div[text()='Oslo'])[2]"));
		WebElement dropNorway = driver.findElement(By.xpath("//div[text()='Norway']"));
		
		act.dragAndDrop(dragOslo, dropNorway);
		Thread.sleep(2000);
		WebElement dragWashington = driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
		WebElement dropUnitedstates =driver.findElement(By.xpath("//div[text()='United States']"));
		
		act.dragAndDrop(dragWashington, dropUnitedstates);
		
		act.perform();
		
		Thread.sleep(3000);
		
		driver.close();
	}
}
