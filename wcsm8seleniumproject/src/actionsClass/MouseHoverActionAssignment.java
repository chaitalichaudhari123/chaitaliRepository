package actionsClass;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MouseHoverActionAssignment 
{
	public static void main(String[] args) throws InterruptedException
	{
		//System.setProperty("driver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		//open browser
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		
	   WebElement target = driver.findElement(By.xpath("//a[text()='Coins ']"));
	   
	   driver.findElement(By.xpath("//span[text()='1 gram'and (contains(@data-p,'l-gold-coins-weight-1gms,m'))]"));
	   
	  WebElement coin = driver.findElement(By.xpath("//div[@class='mousetrap']/preceding-sibling::a[@class='cloud-zoom']"));
	   
	   if (coin.isDisplayed())
	   {
		   System.out.println("coin is displayed");
	   }
	   else
	   {
		   System.out.println("will get exceptions");
	   }
	   Thread.sleep(2000);
	   driver.quit();
	   }
	   

}
