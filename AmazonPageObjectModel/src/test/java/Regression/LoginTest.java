package Regression;

import org.testng.annotations.Test;

import process.LoginProcess;

public class LoginTest extends SetUp{
	
	//Creating the Object Reference to call the validcredentials from LoginProcess
	LoginProcess lpr;
	
	@Test
	public void ValidateWithCorrectUserName_PW() {
		
		lpr = new LoginProcess(driver);
		lpr.LoginWithValidCredential();
		System.out.println("Validated Successfully");
	}

}
