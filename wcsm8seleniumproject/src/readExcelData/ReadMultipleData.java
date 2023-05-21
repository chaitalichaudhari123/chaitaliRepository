package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData 
{	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		//generalise the row count
		FileInputStream fis2 = new FileInputStream("./data/New Microsoft Excel Worksheet.xlsx");
		Workbook wb2 = WorkbookFactory.create(fis2);
		Sheet sheet2 = wb2.getSheet("IPL");
		int data1 = sheet2.getLastRowNum();
		//System.out.println(data1);
		
		//read multiple data by using for loop
		for (int i=1;i<=data1;i++)
		{
			FileInputStream fis = new FileInputStream("./data/New Microsoft Excel Worksheet.xlsx");//provide the path of excel
			Workbook wb = WorkbookFactory.create(fis); //make the file ready for read
			Sheet sheet = wb.getSheet("IPL");//get into the sheet
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(1);
			String data = cell.getStringCellValue();//get the value frome cell or column
			Thread.sleep(2000);
			System.out.println(data);
		}

	}
}
