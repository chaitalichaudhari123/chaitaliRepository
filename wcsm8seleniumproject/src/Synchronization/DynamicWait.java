package Synchronization;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWait  
{ 
		public static void main(String[] args) 
		{
			
			//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.instagram.com/");
			
			driver.findElement(By.name("username")).sendKeys("Admin");
            driver.findElement(By.name("Password")).sendKeys("admin1234");
			
			driver.findElement(By.xpath("//div[text()='log in']")).click();
			

		
	}

}
