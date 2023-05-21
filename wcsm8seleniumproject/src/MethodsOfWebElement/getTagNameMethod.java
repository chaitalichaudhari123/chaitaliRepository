package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class getTagNameMethod 
{
public static void main(String[] args) {
		
		//System.setProperty("driver.edge.driver","./drivers/msedgedriver.exe");
	
		         WebDriver driver=new EdgeDriver();
		         driver.manage().window().maximize();
		   
				//WebDriver driver=new ChromeDriver();
				//driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.get("https://www.selenium.dev/downloads/");
	            
				WebElement element = driver.findElement(By.xpath("//h2[.='News']"));
				
				String tagNameOfNews = element.getTagName();
				
				System.out.println(tagNameOfNews);

}    

}
