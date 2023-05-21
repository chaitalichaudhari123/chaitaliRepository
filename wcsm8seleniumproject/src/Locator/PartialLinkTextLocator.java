package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PartialLinkTextLocator {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/SNEHA/OneDrive/Desktop/HTML/Link.html");
		
		driver.findElement(By.partialLinkText("FlipkartLink")).click();
	}
}
