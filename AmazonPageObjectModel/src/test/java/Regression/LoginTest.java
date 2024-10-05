package Regression;

import java.io.IOException;

import org.testng.annotations.Test;

import process.LoginProcess;

public class LoginTest extends SetUp{
	
	//Creating the Object Reference to call the validcredentials from LoginProcess
	LoginProcess lpr;
	
	@Test
	public void ValidateWithCorrectUserName_PW() throws IOException {
		
		lpr = new LoginProcess(driver);
		lpr.LoginWithValidCredential();
		//System.out.println("Validated Successfully");
	}

	/*
	 * @Test public void ValidWithIncorrectUserName_PW() throws IOException {
	 * lpr = new LoginProcess(driver);
	 * lpr.LoginWithInValidCredential();
	 * System.out.println("invalidated Successfully"); }
	 */
}
