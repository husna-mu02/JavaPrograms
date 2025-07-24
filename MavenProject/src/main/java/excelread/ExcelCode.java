package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {

	static FileInputStream f; // to read the Excel file
	static XSSFWorkbook w;//to represent an entire excel workbook
	static XSSFSheet sh;//to represent a sheet

	public static String readStringData(int row, int col) throws IOException  {
		f = new FileInputStream("C:\\Users\\salma\\Downloads\\Untitled spreadsheet.xlsx");
		w = new XSSFWorkbook(f);
		sh = w.getSheet("Sheet1");
		XSSFRow r = sh.getRow(row);
		XSSFCell c = r.getCell(col);
		return c.getStringCellValue();

	}

	public static String readIntegerData(int row, int col) throws IOException  {
		f = new FileInputStream("C:\\Users\\salma\\Downloads\\Untitled spreadsheet.xlsx");
		w = new XSSFWorkbook(f);
		sh = w.getSheet("Sheet1");
		XSSFRow r = sh.getRow(row);
		XSSFCell c = r.getCell(col);
		int val =   (int) c.getNumericCellValue();  //convert double to int using typecasting
		return String.valueOf(val);   //convert int to string using valueOf() method
		//return val;
	
	}

}