package pom_programs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class {
	@FindBy(xpath = "//input[@name='username']")
	private WebElement useridTb;
	
	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement passwordTb;
	//heart of pom
	public Pom_class(WebDriver driver) {
	
		PageFactory.initElements(driver, this );
	}

	public WebElement getUseridTb() {
		return useridTb;
	}

	public WebElement getPasswordTb() {
		return passwordTb;
	}
	
	public void login(String username , String password)
	{
		getUseridTb().sendKeys("username");
		getPasswordTb().sendKeys("password");
	}
}






