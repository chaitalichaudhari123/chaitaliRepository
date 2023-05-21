package Synchronization;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeTestCase 
{
	public static void main(String[] args) 
	{
		
		
	    //System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://laptop-eeksod7b/login.do");
		
		if(driver.getTitle().equals("actiTIME - Login"));
		
		{
			System.out.println("login page title is matched!!,test case passed");
	
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	
	    {
		System.out.println("login page title is not matched!!,test case failed");
		}
	
	     if(driver.getTitle().equals("actiTime- Enter Time-track"))
	     {
	    	 System.out.println("home page title is matched!!,test case passe!!");
	     }
	     else
	     {
	    	 System.out.println("login page title is not matched!!,test case failed");
	     }
	}
}
}

