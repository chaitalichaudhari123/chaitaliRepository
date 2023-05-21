package keyWordDrivenPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flib 
{
	
		public static void main(String[] args) throws InterruptedException, IOException
		{
			//System.setProperty("driver.chrome.driver","./drivers/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://laptop-eeksod7b/login.do");
			
		   //to read the data frome external files create the obj of flib
			
			Flib flib = new Flib();
		    driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/ActitimeTestData"));
		    driver.findElement(By.id("pwd")).sendKeys(flib.readExcelData("./data/ActitimeTestData"));

		
		
	}

}
