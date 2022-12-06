package test_ng_framework;
import org.testng.Assert;
import org.testng.annotations.Test;
//Hard assert strict level comparison
public class Test_ng_Assertion {
	@Test
	public void checkAssertion()
	{
		String actual = "Motorola";
		String expected = "motorola";
		
		Assert.assertEquals(actual, expected);
		
		System.out.println("it's raining!!!");
	}
	
	//Hard assert contains level comparison
	@Test
	public void checkingAssertion()
	{
		String actual = "Motorola";
		String expected = "ola";
		
		Assert.assertTrue(actual.contains(expected));
		
		System.out.println("ulalalala");
		
		
	}
}


