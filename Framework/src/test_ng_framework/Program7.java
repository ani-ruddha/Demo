package test_ng_framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program7 {

	@Test(enabled = true)
	public void createUser()
	{
		System.out.println("user created!!");
	}
	@Test(dependsOnMethods = "createUser")
	public void modifyUser()
	{
		System.out.println("user modified!!");
	}
	@Test
	public void deleteUser()
	{
		Reporter.log("delete user ha ha ha" , true);
	}
}
