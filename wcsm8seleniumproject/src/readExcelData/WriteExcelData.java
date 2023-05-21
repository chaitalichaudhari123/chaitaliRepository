package readExcelData;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData 
{
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./data/New Microsoft Excel Worksheet.xlsx");
		Workbook wb = WorkbookFactory.create(fis); 
		Sheet sheet = wb.getSheet("IPL");
		Row row = sheet.getRow(1);
		
		Cell cell = row.createCell(2);
		cell.setCellValue("BCCI");
		
		FileOutputStream fos=new FileOutputStream("./data/New Microsoft Excel Worksheet.xlsx");
		wb.write(fos);
	}

}
