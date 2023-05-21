package webBasedPopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandledAlert 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("driver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/SNEHA/OneDrive/Desktop/wa/alert.html");
		
		//generate alert popup
		driver.findElement(By.xpath("//button[.='click me!']")).click();
		Thread.sleep(2000);
		
		//handle alert
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		//al.accept();
	    // al.dismiss();
		System.out.println(al.getText());
		al.dismiss();
	
	}

}
