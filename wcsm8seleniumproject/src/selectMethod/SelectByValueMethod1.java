package selectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValueMethod1 
{
	//multi select dropdown

	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("driver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/SNEHA/OneDrive/Desktop/HTML/multipleselectstaticdropdown.html");

		WebElement dropdown = driver.findElement(By.name("menu"));

		Select sel = new Select(dropdown);

		sel.selectByValue("v2");
		Thread.sleep(4000);



	}

}



