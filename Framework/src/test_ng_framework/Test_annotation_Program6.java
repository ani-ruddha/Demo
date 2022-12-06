package test_ng_framework;

import org.testng.annotations.Test;

public class Test_annotation_Program6 {

	@Test(enabled = false)
	public void login() {
		
		System.out.println("login done!!!");
	}
	@Test(dependsOnMethods = "login")
	public void userCreated()
	{
		System.out.println("user created!!");
	}
	@Test
	public void userExecuted()
	{
		System.out.println("user executed!!");
	}
}
