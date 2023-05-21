package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedMethod 
{
	public static void main(String[] args) {
		
		//System.setProperty("driver.chrome.driver","./drivers/chromedriver.exe");
		
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.get("https://www.netflix.com/in/login");
				
				WebElement usnTB = driver.findElement(By.name("userLoginId"));
				WebElement passTB = driver.findElement(By.name("password"));
				WebElement button = driver.findElement(By.xpath("//button[text()='Sign In']"));
				
				if(usnTB.isDisplayed());
				{
					usnTB.sendKeys("chaitu123");
				}
				//else
				{
					System.out.println("will get exception");
				}
				
				if(passTB.isDisplayed());
				{
					passTB.sendKeys("abds143");
				}
				//else 
				{
					System.out.println("will get exception");
				}
				if(button.isDisplayed());
				{
					button.click();
				}
				
				//else
				{
					System.out.println("will get exception");
				}
	}

}
