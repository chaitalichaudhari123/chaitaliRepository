package dataDrivenPackage;

import java.io.IOException;

import java.time.Duration;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase extends Flib
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		//System.setProperty("driver.chrome.driver","./drivers/chromedriver.exe");
		
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("http://laptop-eeksod7b/login.do");
				 
       //to read the date from external files create the obj of flib
				
		Flib flib = new Flib();		
				
		int rc = flib.rowCount("./data/ActitimeTestData.xlsx","invalidcreads");
	    
		for(int i=1;i<=rc;i++)
		{
			String invalidUsername = flib.readExcelData("./data/ActitimeTestData.xlsx","invalidcreads",i,0);
		
			String invalidPassword = flib.readExcelData("./data/ActitimeTestData.xlsx","invalidcreads",i,1);	
				
		    driver.findElement(By.name("username")).sendKeys(invalidUsername);
		    
		    driver.findElement(By.name("pwd")).sendKeys(invalidPassword);
		    
		    driver.findElement(By.id("loginButton")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.name("username")).clear();
				
		}
		
	}
				
				
}				