package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment3OnId {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.id("login-username")).sendKeys("abcd1452");
		Thread.sleep(2000);
		driver.findElement(By.id("login-signin")).sendKeys("1234asdf");
		driver.findElement(By.xpath("//button[text()='login-signin']")).click();
	}
}

	

