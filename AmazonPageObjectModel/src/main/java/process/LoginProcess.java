package process;

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
	public void LoginWithValidCredential() {
		lp.UserName().sendKeys("abc@gmail.com");
		lp.Password().sendKeys("123456");
		lp.SignIn().click();
}
}

