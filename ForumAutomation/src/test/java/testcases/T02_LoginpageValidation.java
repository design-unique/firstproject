package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.browserEngine;
import utilities.testData;

public class T02_LoginpageValidation {
	
	public static WebDriver driver;
	
	@BeforeMethod
	
	public static void openBrowser()
	
	{
		//loading the browser
		driver=browserEngine.browserConfig();
		
	}
	
	@Test
	
	public static void LoginpageValidation()
	
	{
		//open process of the login page
		driver.get(testData.homepageURL);
		driver.findElement(By.xpath(testData.fromhomepagetologinpage)).click();
		
		//login page validation process
		String loginpageactualTitle=driver.getTitle();
		
		AssertJUnit.assertEquals(loginpageactualTitle, testData.loginpageexpectedTitle);
		
		//identify the email as id
		driver.findElement(By.name("email")).sendKeys(testData.regpageEmail);
		
		//identify the password
		driver.findElement(By.name("password")).sendKeys(testData.regpagePassword);
		
		//select the check box
		driver.findElement(By.xpath(testData.loginpageCheckbox)).click();
		
		//press the sign in button
		driver.findElement(By.xpath(testData.loginpageSigninbutton)).click();
		
		//after login the page validating process
		String afterloginpageactualTitle=driver.getTitle();
		
		AssertJUnit.assertEquals(afterloginpageactualTitle, testData.afterloginpageexpectedTitle);
		
		//logout process
		driver.findElement(By.xpath(testData.loginpageDropdown)).click();
		driver.findElement(By.xpath(testData.loginpageLogout)).click();
		
		
	}
	

	@AfterMethod
	
	public static void tearDown()
	
	{
		//close the browser
		driver.quit();
	}

}
