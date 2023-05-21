package pageObjectMOdelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	//store all the webElement of login page
	
	//declare with @FindBy annotation
	
	//System.setProperty("driver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();

	@FindBy(name="username")private WebElement usernameTB;
	@FindBy(name="password")private WebElement passwordTB;
	@FindBy(id="loginButton")private WebElement loginButton;
	@FindBy(id="keepLoggedInCheckBox")private WebElement keepLoggedInCheckBox;
	@FindBy(linkText ="Actimind Inc.")private WebElement actiMindLink;
	
	//initialization
	
	public LoginPage(WebDriver driver)
	{
	   PageFactory.initElements(driver,this);
	}
	
	//utilization
	
	public WebElement getUsernameTB() {
		return usernameTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getKeepLoggedInCheckBox() {
		return keepLoggedInCheckBox;
	}

	public WebElement getActiMindLink() {
		return actiMindLink;
	}
	
	
	//operational methods
	
	public void validLogin(String validUsername,String validPassword)
	{
		usernameTB.sendKeys(validUsername);
		passwordTB.sendKeys(validPassword);
		loginButton.click();
		
	}
	
	public void inValidLogin(String invaliUsername,String invalidPassword) throws InterruptedException
	{

		usernameTB.sendKeys(invaliUsername);
		passwordTB.sendKeys(invalidPassword);
		loginButton.click();
		Thread.sleep(2000);
		usernameTB.clear();
	}
	
}
	
	
	
	
	
	
	 
	
	
	
	
	
	
	
	
	
