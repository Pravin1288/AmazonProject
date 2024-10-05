package Regression;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SetUp {

	WebDriver driver;

	//To Read the QA_URL, creating property file and reading the url from it
	Properties prop = new Properties();
	
	@BeforeClass
	public void Initialization() throws IOException, InterruptedException {
		
		//To Read the File using File Input Stream
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Properties\\config.properties");
		
		//To Load the File
		prop.load(fis);
		
		//Open Chrome Browser
		driver = new ChromeDriver();
		
		//Read the URL
		driver.get(prop.getProperty("QA_Url"));
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Allow Cookies
		driver.findElement(By.xpath("//button[contains(text(),'Allow all cookies')]")).click();
		Thread.sleep(3000);
		
		//Get the Title
		System.out.println(driver.getTitle());	
	}
	
	@AfterClass
	
	public void CleanUp() {
		driver.quit();
	}
	
}
