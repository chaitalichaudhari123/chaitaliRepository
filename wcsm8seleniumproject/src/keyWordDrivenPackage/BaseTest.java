package keyWordDrivenPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjectMOdelPackage.IAutoConstant;

public class BaseTest extends Flib implements IAutoConstant
{
	 static WebDriver driver;

	public void openBrowser() throws IOException
	{
		Flib flib = new Flib();
	    String browserValue = flib.readPropertyData(PROP_PATH,"url");
	    String url = flib.readPropertyData(PROP_PATH,"url");
	    
	    if (browserValue.equals("chrome"))
	    {
	    	System.setProperty(CHROME_KEY, CHROME_PATH);
	    	driver=new ChromeDriver();
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    	driver.get(url);
			
		} 
	    else if (browserValue.equals("Firefox")) 
	    {
	    	System.setProperty(GECKO_KEY, GECKO_PATH);
	    	driver=new ChromeDriver();
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    	driver.get(url);
			
		}
	    else if (browserValue.equals("Edge"))
	    {
	    	System.setProperty(EDGE_KEY, EDGE_PATH);
	    	driver=new ChromeDriver();
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    	driver.get(url);
			
		}
	    else 
	    {
	    	System.out.println("Invalid BrowserValue!!!!");
			
		}
	    
	}
	    
     public void closeBrowser()
     {
    	 driver.quit();
     }
		
	{
		
	}
}

