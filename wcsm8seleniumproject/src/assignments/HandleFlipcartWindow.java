package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFlipcartWindow 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.chrome.driver","./ drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	    driver.get("https://www.flipkart.com/");
	
 
	    driver.findElement(By.name("q")).sendKeys("samsung s23 ultra");
	    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	   
	    
	    //handle of parent window
	    String parentHandle = driver.getWindowHandle();
	    Thread.sleep(2000);
	
        driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S23 Ultra 5G (Green, 256 GB)']"));
        
        //handle of parent and child window
        Set<String> allHandles = driver.getWindowHandles();
	    for(String wh:allHandles)
	   {
		 if (!parentHandle.equals(wh))
		 {
			 driver.switchTo().window(wh);
		 }
			
		 else 
		 {
		   
		 }
	   }			
		
			 String actualTitle = driver.getTitle();
			   if(actualTitle.equals("samsung S23 Ultra-Buy product Online at Best Price in India-All Catogories | Flipkart.com"));
			   {
				   System.out.println("its child window");		 }
	            }
	 else 

        	{
	        	System.out.println("window is not handle");
			}
	      
	   }
	   
	   
		   
	
	
