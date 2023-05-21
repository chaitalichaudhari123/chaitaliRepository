package operatationalMethod;

import java.lang.StackWalker.Option;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import MethodsOfWebElement.GetTextMethod;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class GetAllSelectedMethod 
{
	private static WebElement op;

	public static void main(String[] args) throws InterruptedException 
	{

		//System.setProperty("driver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/SNEHA/OneDrive/Desktop/HTML/multipleselectstaticdropdown.html");

		WebElement dropdown = driver.findElement(By.name("menu"));


		Select sel = new Select(dropdown);
		
		// how to select multiple options

		for (int i=0;i<5;i++)
		{
			sel.selectByIndex(i);
		}
         List<WebElement> alloptions = sel.getAllSelectedOptions();
		for(WebElement op:alloptions);
		{

			
			String options = op.getText();

			System.out.println(options);			}
		}
	}
	
