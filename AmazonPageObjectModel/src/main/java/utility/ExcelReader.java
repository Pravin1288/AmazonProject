package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	//Declaring Three Parameters
	//String
	//Row
	//Column
	//Sheetname = name of the sheet (For Eg: Sheet1,Sheet2 etc)
	/*
	 * public XSSFCell ReadingDataFromExcel (String sheetname, int row, int column)
	 * throws IOException { //Creating the Excel Reader Function //Creating File
	 * FileInputStream fis = new
	 * FileInputStream(System.getProperty("user.dir")+"\\Data\\CredentialSheet.xlsx"
	 * ); XSSFWorkbook wb = new XSSFWorkbook(fis); XSSFSheet sheet =
	 * wb.getSheet(sheetname); //Fetching ROW XSSFRow r = sheet.getRow(row);
	 * //Fetching Column XSSFCell c = r.getCell(column); //Return the Value of c
	 * return c; }
	 */
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
