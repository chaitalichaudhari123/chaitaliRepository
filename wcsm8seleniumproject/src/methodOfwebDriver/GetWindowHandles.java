package methodOfwebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles
{
	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		WebElement link = driver.findElement(By.linkText("open a popup window"));
	    
		Point point = link.getLocation();
		int xaxis=point.getX();
		int yaxis=point.getY();
		
         JavascriptExecutor jse = (JavascriptExecutor)driver;		
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-250)+")");
		Thread.sleep(2000);
		
		//handle or address of current window/parent window
		String parentHandle = driver.getWindowHandle();
		System.out.println("handle of parent window:"+parentHandle);
		
		//click on link address of all windows
		Set<String> allHandles = driver.getWindowHandles();
		for(String wh:allHandles)
		{
			System.out.println(wh);
		}
		
	}

}


