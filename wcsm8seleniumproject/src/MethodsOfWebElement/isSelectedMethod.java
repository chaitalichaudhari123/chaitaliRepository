package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedMethod 
{
	public static void main(String[] args) 
	{
		//System.setProperty("driver.chrome.driver","./drivers/chromedriver.exe");
		
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.get("http://laptop-eeksod7b/login.do");
				
				WebElement checkbox = driver.findElement(By.name("remember"));
	
                boolean verify = checkbox.isSelected();

                System.err.println(verify);
                
                checkbox.click();
                boolean verify1 = checkbox.isSelected();
                
                System.out.println(verify1);
}
}
