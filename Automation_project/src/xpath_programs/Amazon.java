package xpath_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium folder\\chromedriver.exe");
			
			ChromeDriver driver  = new ChromeDriver();
			
			driver.get("https://www.amazon.in/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shoes");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(3000);
			String brand =	driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[2]")).getText();
			System.out.println("bramd name is : " + brand);
			Thread.sleep(3000);
			String shoename = 	driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")).getText();
			System.out.println("shoe name is : " + shoename);
			Thread.sleep(3000);
			String price =	driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]/../../preceding-sibling::span/../following-sibling::div[2]/div/a/span/span/span[2]")).getText();
			System.out.println(brand + "------" + shoename + " -----" + price);
			
		Thread.sleep(2000);
		driver.close();
	}
}
