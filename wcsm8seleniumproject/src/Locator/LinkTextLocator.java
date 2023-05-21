package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextLocator 
{
public static void main(String[] args) throws InterruptedException {
	
	//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("file:///C:/Users/SNEHA/OneDrive/Desktop/HTML/Link.html");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Flipkartlink")).click();
	
	
	
}




}
