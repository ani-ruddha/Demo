package test_ng_framework;

import org.testng.annotations.Test;

public class Test_annotation_Program5 {

	@Test
	public void login()
	{
		System.out.println("login done!!");
	}
	@Test(invocationCount = 10)
	public void userCreated()
	{
		System.out.println("user created");
	}
}
