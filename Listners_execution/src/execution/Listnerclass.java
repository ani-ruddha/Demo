package execution;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

//import base_class_execution.Base_class;

public class Listnerclass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot sh = (TakesScreenshot)Base_class.driver;
		File src = sh.getScreenshotAs(OutputType.FILE);
		File dist = new File("D:\\Selenium folder\\"+result.getName()+".png");
		try {
			Files.copy(src, dist);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
