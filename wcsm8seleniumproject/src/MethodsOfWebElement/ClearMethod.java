package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
public static void main(String[] args) throws InterruptedException {
	
	//System.setProperty("driver.chrome.driver","./drivers/chromedriver.exe");
	
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("http://laptop-eeksod7b/login.do");
			
			WebElement userNameTB=driver.findElement(By.name("username"));

	        WebElement passwordTB=driver.findElement(By.name("pwd"));
	        
	        userNameTB.sendKeys("admin");
	        passwordTB.sendKeys("manager");
	        
	        Thread.sleep(2000);
	        driver.navigate().refresh();
	        
	        //userNameTB.clear();
	        Thread.sleep(2000);
	        passwordTB.clear();
}
}
