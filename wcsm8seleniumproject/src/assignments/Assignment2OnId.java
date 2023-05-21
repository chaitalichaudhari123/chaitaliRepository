package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment2OnId {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver/exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("abcd1452");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("1234asdf");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}
}
