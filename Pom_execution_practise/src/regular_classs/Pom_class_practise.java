package regular_classs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class_practise {

	@FindBy(xpath = "//input[@name='username']")
	private WebElement userId;
	
	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement passwordId;
	
	public Pom_class_practise(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}
	
	public WebElement getUserId()
	{
		return userId;
	}
	
	public WebElement getPasswordId()
	{
		return passwordId;
		
	}
	
	public void login(String username , String password)
	{
		getUserId().sendKeys(username);
		getPasswordId().sendKeys(password);
	}
}
