package utility;

import org.testng.annotations.Test;
import org.openqa.selenium.By;


public class Task extends Base_class_for_group_execution{

	@Test(groups = {"smoke"})
	
	public void executeTask()
	{
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
	}
}
