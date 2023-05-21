package screenShotPackage;

import java.io.File;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotWay1 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		//System.setProperty("driver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//consider we are taking ss of selenium.dev wp
		driver.get("https://www.selenium.dev");
		
         
		//implementation of method
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/ss1.png");
				
		Files.copy(src, dest);
		        
		}

	
	
}


