package assignments;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicateTreeSetMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{

		//System.setProperty("driver.chrome.driver","./drivers/chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("file:///C:/Users/SNEHA/OneDrive/Desktop/HTML/singleselectstaticdropdown.html");
	
    WebElement dropdown = driver.findElement(By.name("menu"));
        
    //to handle dropdown create obj of select class
    Select sel = new Select(dropdown);
    
    //to get all the options from dropdown
    List<WebElement> alloptions = sel.getOptions();
    
    //to eliminate the duplicate& maintain the order of insetion we use
     TreeSet<String> ts = new TreeSet<String>();
    
    //to read the list by eliminating duplicates....
    for(int i=0;i<alloptions.size();i++)
    {
    	// get the options& text of options
    	String op = alloptions.get(i).getText();
    	
    	//add the text of options to treeset
	     ts.add(op);
		
    }
    //to read the options from set
    for(String options:ts)
    {
    	Thread.sleep(2000);
    	System.out.println(options);
    
}

	
	}

		
	}
