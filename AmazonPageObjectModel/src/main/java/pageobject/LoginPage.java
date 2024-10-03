package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Helper;

public class LoginPage extends Helper{
	
	//Declaring the PageObject properly this time
	//Hence Rewriting it
	//If therer is id and xpath changes, we can write it here
	public static final String EmailBox = "username";
	public static final String PasswordBox = "password";
	public static final String SignInBox = "//button[@type='submit']";
	
	
	//Declaring Webelements
	WebElement elements;

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement UserName() {
		elements = getElementName(EmailBox);
		return elements;
	}
	
	public WebElement Password() {
		elements = getElementName(PasswordBox);
		return elements;
	}
	
	public WebElement SignIn() {
		elements = getElementXPath(SignInBox);
		return elements;
	}

}
