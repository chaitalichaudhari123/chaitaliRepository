package keyWordDrivenPackage;

import org.openqa.selenium.WebDriver;

public class BaseTest extends Flib
{
	static WebDriver driver;

	public void openBrowser()
	{
		Flib flib = new Flib();
	    String browservalue = flib.readPropertyData("./data/config.properties","browser");
	    String url = flib.readPropertyData("./data/config.properties","url");
	
	
	if(browserValue.equalsIgnoreCase("chrome"))
	{
		
	}
	}
}
