package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readData 
{
	public static XSSFWorkbook workbook;
	
	public static XSSFSheet sheet;
	
	public static XSSFCell cell;
	
	
	public static void readexcelData(String filepath, String sheetname) throws IOException
	
	{
		FileInputStream fis = new FileInputStream(filepath);
		
		workbook = new XSSFWorkbook(fis);
		
		sheet = workbook.getSheet(sheetname);		
		
	}
	
	public static String readcellData(int rowNum, int colNum)
	
	{
		cell = sheet.getRow(rowNum).getCell(colNum);
		
		String readcellValue=cell.getStringCellValue();
		
				return readcellValue;
	}
	

}
