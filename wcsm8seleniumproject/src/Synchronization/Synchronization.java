package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization
{
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedrier.exe");
		
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("Password")).sendKeys("admin123");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}

}
