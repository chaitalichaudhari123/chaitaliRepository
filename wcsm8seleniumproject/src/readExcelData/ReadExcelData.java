package readExcelData;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData 
{
	//read data from IPL excel sheet
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./data/New Microsoft Excel Worksheet.xlsx");//provide the path of excel
		Workbook wb = WorkbookFactory.create(fis); //make the file ready for read
		Sheet sheet = wb.getSheet("IPL");//get into the sheet
		Row row = sheet.getRow(6);
	    Cell cell = row.getCell(2);
        String data = cell.getStringCellValue();
        System.out.println(data);
	}
}
