package test_ng_framework;

import org.testng.annotations.Test;

public class Test_annotation_Program4 {

	@Test
	public void login()
	{
		System.out.println("login done!!!");
	}
	@Test
	public void createUser()
	{
		System.out.println("user created");
	}
	@Test(enabled = false)
	public void deleteUser()
	{
		System.out.println("user deleted");
	}
	@Test
	public void executeOperation()
	{
		System.out.println("operation executed!!");
	}
}
