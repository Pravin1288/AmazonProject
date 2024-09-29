package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Helper;

public class LoginPage extends Helper{
	
	//Declaring Webelements
	WebElement elements;

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement UserName() {
		elements = getElementName("username");
		return elements;
	}
	
	public WebElement Password() {
		elements = getElementName("password");
		return elements;
	}
	
	public WebElement SignIn() {
		elements = getElementXPath("//button[@type='submit']");
		return elements;
	}

}
