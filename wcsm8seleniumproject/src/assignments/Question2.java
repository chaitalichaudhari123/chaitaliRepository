package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Question2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		WebElement link = driver.findElement(By.linkText("Open a popup window"));

		Point point = link.getLocation();
		int xaxis=point.getX();
		int yaxis=point.getY();

		JavascriptExecutor jse = (JavascriptExecutor)driver;		
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-250)+")");
		Thread.sleep(2000);

		String parentHandle = driver.getWindowHandle();
		System.out.println("handle of parent window:"+parentHandle);

		link.click();		
        Thread.sleep(2000);

        //to close all the browser without using quit method
        Set<String> allHandles = driver.getWindowHandles();
        for (String wh:allHandles)
        {
    	   Thread.sleep(2000);
    	   driver.switchTo().window(wh).close();
	}

}


}
