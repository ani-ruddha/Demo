package utility_class_for_cross_browser;

import org.testng.annotations.Test;
import org.openqa.selenium.By;


public class Execution_task extends Base_class_for_cross_browser_execution{

	
	@Test
	public void task() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
	}
}
