package test_ng_framework;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//soft assert strict level comparison
public class Test_ng_Assertion_soft_assert {
	@Test
	public void checkAssertion()
	{
		String actual = "Mahabharat";
		String expected = "mahabharat";
		
		SoftAssert sf = new SoftAssert();		
		sf.assertEquals(actual, expected);		
		System.out.println("further execution!!!");
		sf.assertAll();
	}
	
	//Soft assert contains level comparison
	
	@Test
	public void checkAssertion1()
	{
		String actual = "Mahabharat";
		String expected = "bharat";
		
		SoftAssert sf = new SoftAssert();		
		sf.assertTrue(actual.contains(expected));	
		System.out.println("further execution22!!!");
		sf.assertAll();
	}
	
	
	
}
