package process;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageobject.LoginPage;
import utility.Helper;

public class LoginProcess extends Helper {
	
	//Creating a object reference to call LoginPage
	LoginPage lp = new LoginPage(driver);

	
	//For Multiple User Values from the Excel Sheet,
	//We are declaring the data globally here
	String UserNameFromExcel;
	String PasswordFromExcel;
	
	
	public LoginProcess(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//we will create another method here for valid credentials
	public void LoginWithValidCredential() throws IOException {
		for (int i=1;i<=3;i++)
		{
		// i --> column is constant, row is increasing so row is (i) 
		UserNameFromExcel = ReadingDataFromExcel ("Sheet1", i, 0);  
		PasswordFromExcel = ReadingDataFromExcel ("Sheet1", i, 1);	
		lp.UserName().clear();
		lp.UserName().sendKeys(UserNameFromExcel);
		lp.Password().clear();
		lp.Password().sendKeys(PasswordFromExcel);
		lp.SignIn().click();
				}
}
	
	public void LoginWithInValidCredential() throws IOException {
		UserNameFromExcel = ReadingDataFromExcel ("Sheet1", 2, 0);
		PasswordFromExcel = ReadingDataFromExcel ("Sheet1", 2, 1);	
		lp.UserName().sendKeys(UserNameFromExcel);
		lp.Password().sendKeys(PasswordFromExcel);
		lp.SignIn().click();
}
}

