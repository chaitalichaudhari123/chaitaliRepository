package operatationalMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.netty.util.internal.logging.AbstractInternalLogger;

public class GetOptionsMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{

		//System.setProperty("driver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/SNEHA/OneDrive/Desktop/HTML/multipleselectstaticdropdown.html");

		WebElement dropdown = driver.findElement(By.name("menu"));

		Select sel = new Select(dropdown);
		
		List<WebElement> allOptions = sel.getOptions();
		
		//for loop
//		
			
//		for(int i=0;i<allOptions.size();i++)
//		{
//			String option = allOptions.get(i).getText();
//			System.out.println(option);
//		}
		//advance for loop
		
		for(WebElement op:allOptions)
		{
		String options = op.getText();
	    System.out.println(options);
		}
	}
}
