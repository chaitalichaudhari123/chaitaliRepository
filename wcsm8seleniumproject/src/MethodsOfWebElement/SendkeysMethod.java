package MethodsOfWebElement;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("driver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://laptop-eeksod7b/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin123");
		driver.findElement(By.name("pwd")).sendKeys("manager123");
		
		//WebElement userNameTB=driver.findElement(By.name("username"));
		//userNameTB.sendKeys("admin123");
		
        WebElement userNameTB=driver.findElement(By.name("pwd"));
		userNameTB.sendKeys("manager123");
		
	}
}
