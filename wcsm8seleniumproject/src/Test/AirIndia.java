package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirIndia  
	{
	public static void main(String[] args) throws InterruptedException 
	{
			// System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

			ChromeOptions co=new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
	        co.addArguments("--disable-notification");

			WebDriver driver=new ChromeDriver(co);
			driver.manage().window().maximize();
            driver.get("https://www.airasia.co.in/home");	
            
            
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(""))
	  
	        
	        
	}      
	}

