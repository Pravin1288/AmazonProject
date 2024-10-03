package process;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.openqa.selenium.WebDriver;

import pageobject.LoginPage;
import utility.Helper;

public class LoginProcess extends Helper {
	
	//Creating a object reference to call LoginPage
	LoginPage lp = new LoginPage(driver);

	public LoginProcess(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//we will create another method here for valid credentials
	public void LoginWithValidCredential() throws IOException {
		XSSFCell UserNameFromExcel = ReadingDataFromExcel ("Sheet1", 1, 0);
		XSSFCell PasswordFromExcel = ReadingDataFromExcel ("Sheet1", 1, 1);
		
		
		lp.UserName().sendKeys(UserNameFromExcel.toString());
		lp.Password().sendKeys(PasswordFromExcel.toString());
		lp.SignIn().click();
}
	
	public void LoginWithInValidCredential() {
		lp.UserName().sendKeys("abcd@gmail.com");
		lp.Password().sendKeys("12345666666");
		lp.SignIn().click();
}
}

