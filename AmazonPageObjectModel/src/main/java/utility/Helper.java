package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Helper {
	//Creating the commonly used functions here
	
	//Applying webdriver gloabally here,
	public static WebDriver driver;
	
	//Applying Wait gloabally here,
	public static Wait<WebDriver> wait;
	 
	//To Inherit the constructor we can use SUPER keyword
	
	// Creating the Constructor we can pass the FluentWait/Webdriver or any method everywhere
	// Creating the Constructoras HELPER
	// Creating the Variable as driver
	public Helper(WebDriver driver) {
	this.driver = driver;
	wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
			.pollingEvery(Duration.ofSeconds(6))
			.ignoring(NoSuchElementException.class);
	}
	
	// Creating the locator for by.ID
	
	public static WebElement getElementId(String locator) { //capturing the element
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));  //Instead of driver.find element using expectedconditions
		
	}

	
	//Now copy the above method for mutiple locators (Xpath,classname)
	
	
	public static WebElement getElementName(String locator) { //capturing the element
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locator)));  //Instead of driver.find element using expectedconditions
		
	}
	
	public static WebElement getElementXPath(String locator) { //capturing the element
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));  //Instead of driver.find element using expectedconditions
		
	}
	
	public static WebElement getElementCSS(String locator) { //capturing the element
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));  //Instead of driver.find element using expectedconditions
		
	}
	
	public static WebElement getElementClassName(String locator) { //capturing the element
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locator)));  //Instead of driver.find element using expectedconditions
		
	}
	
	
	
	//Copy/Write the EXCEL_READER_FUNCTION
	public static String ReadingDataFromExcel (String sheetname, int row, int column) throws IOException {
		//Creating the Excel Reader Function
		//Creating File
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Data\\CredentialSheet.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet(sheetname);
		//Fetching ROW
		XSSFRow r = sheet.getRow(row);
		//Fetching Column
		XSSFCell c = r.getCell(column);
		//Return the Value of c
		return c.toString();	
	}
	
}
