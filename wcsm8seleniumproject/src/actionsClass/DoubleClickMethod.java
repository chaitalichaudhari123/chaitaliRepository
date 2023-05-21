package actionsClass;

import java.io.File;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		//System.setProperty("driver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://laptop-eeksod7b/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
         
		//click on setting
		
		driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();
		
		//click on logo and color
		driver.findElement(By.xpath("//a[contains(.,'Logo &')]")).click();
		
		Thread.sleep(2000);
		
		//click on radio button
		driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();
		
		//click on choose file button
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		
		//create obj of the action class
       Actions act = new Actions(driver);	
       
       //use this method for doubleclick
       act.doubleClick(target).perform();
       Thread.sleep(2000);
       
       //close the brouser
       driver.quit();
	}
       
}