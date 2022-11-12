package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.browserEngine;
import utilities.testData;

public class T01_HomepageValidation {
	
	public static WebDriver driver;
	
	@BeforeMethod
	
	public static void openBrowser()
	
	{
		//loading the browser
		driver=browserEngine.browserConfig();
	}
	
	@Test
	
	public static void HomepageValidation()
	
	{
		//opening the home page
		driver.get(testData.homepageURL);
		
		//validating the home page
		String homepageactualTitle=driver.getTitle();
		
		AssertJUnit.assertEquals(homepageactualTitle, testData.homepageexpexctedTitle);
	}
	

	@AfterMethod
	
	public static void tearDown()
	
	{
		//close the browser
		driver.quit();
	}

}
