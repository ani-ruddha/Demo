package test_ng_framework;

import org.testng.annotations.Test;

public class Test_annotation_Program3 {

	@Test(priority = -1)
	public void login()
	{
		System.out.println("login done!!!");
	}
	@Test(priority = 0)
	public void createUser()
	{
		System.out.println("user created");
	}
	@Test(priority = 1)
	public void executeOperation()
	{
		System.out.println("operation executed!!");
	}
	

}
