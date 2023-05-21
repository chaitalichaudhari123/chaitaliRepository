package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssignmentLocator2 {
	 
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				
				ChromeOptions co=new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				
				WebDriver driver=new ChromeDriver(co);
				driver.manage().window().maximize();
				
				driver.get("https://www.facebook.com/"); 
				Thread.sleep(2000);
				driver.findElement(By.name("email")).sendKeys("sfeydg");
				Thread.sleep(2000);
				driver.findElement(By.name("pass")).sendKeys("asjjed");
				driver.findElement(By.cssSelector("button[class$=_4jy1 selected_51sy']")).click();
			}
		
}

