package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Hotstar 
{
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");


				WebDriver driver =new EdgeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://www.hotstar.com/in/subscribe/sign-in?returnURL=/in/subscribe/my-account"); 
				Thread.sleep(2000);
				driver.findElement(By.id("phoneNo")).sendKeys("7745841430");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@type='button']")).click();
			}
		
}



