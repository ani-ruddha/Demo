package utility;

import org.testng.annotations.Test;
import org.openqa.selenium.By;


public class Users extends Base_class_for_group_execution {

	@Test(groups = {"smoke" ,"sanity"})
	public void executeUsers()
	{
		driver.findElement(By.xpath("//div[@id='container_users']")).click();
	}
}
