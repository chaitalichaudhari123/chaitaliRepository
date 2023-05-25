package pageObjectMOdelPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage 
{
	@FindBy(xpath="//a[.=Logout']")private 	WebElement logoutLink;

}
