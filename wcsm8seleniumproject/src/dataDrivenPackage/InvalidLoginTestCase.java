package dataDrivenPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
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
				 

}
