package methodOfwebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetPageSourceMethod {

	public static void main(String[] args) {
		//to use source code of current webPage
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");

		String scode=driver.getPageSource();
		System.out.println(scode);


	}
}
