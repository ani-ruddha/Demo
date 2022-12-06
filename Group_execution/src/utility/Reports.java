package utility;

import org.testng.annotations.Test;
import org.openqa.selenium.By;


public class Reports extends Base_class_for_group_execution {

	@Test(groups = {"sanity"})
	public void executeReports()
	{
		driver.findElement(By.xpath("//div[@id='container_reports']")).click();
	}
}
