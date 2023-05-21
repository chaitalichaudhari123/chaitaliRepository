package readExcelData;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogin
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		//System.setProperty("driver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://laptop-eeksod7b/login.do");
		
		//read the valid username frome ActiTimeTestData excel sheet
	   FileInputStream fis = new FileInputStream("./data/ActitimeTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis); 
		Sheet sheet = wb.getSheet("validcreds");
		Row row = sheet.getRow(1);
	    Cell cell = row.getCell(0);
        String validusername = cell.getStringCellValue();
		
        //read the valid password frome actitimetestdata excel sheet
        FileInputStream fis2 = new FileInputStream("./data/ActitimeTestData.xlsx");
		Workbook wb2 = WorkbookFactory.create(fis); 
		Sheet sheet2 = wb.getSheet("validcreds");
		Row row2 = sheet.getRow(1);
	    Cell cell2 = row.getCell(1);
        String validpassword = cell2.getStringCellValue();
        
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("validusername");
        Thread.sleep(2000);
        driver.findElement(By.id("pws")).sendKeys("validpassword");
        Thread.sleep(2000);
        driver.findElement(By.id("loginButton")).click();
		
	}

}
