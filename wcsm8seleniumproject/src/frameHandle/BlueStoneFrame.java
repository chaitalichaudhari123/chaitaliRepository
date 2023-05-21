package frameHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStoneFrame 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//ChromeOptions co=new ChromeOptions();
		//co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		WebElement frameelement = driver.findElement(By.xpath("//iframe[@name='fc_widget']']"));
		
		//switch to controls to frame for clickon chatbox
		driver.switchTo().frame("fc_widge");//by using name or ID
		
		//driver.switchto().frame for click on checkbox
	     driver.findElement(By.xpath("//div[@id='chat-icon'] "));
	     WebElement chatBox = driver.findElement(By.id("chat-icon"));
	     
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(chatBox)).click();
		
		//switch the control to
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("chat-fc-name")).sendKeys("chaitu_123");
		driver.findElement(By.id("chat-fc-email")).sendKeys("chaitu35chaudhari@gmal.com");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("7745841430");

	}
}
