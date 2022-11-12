package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.browserEngine;
import utilities.testData;

public class T03_RegistrationpageValidation {
	
	public static WebDriver driver;
	
	@BeforeMethod
	
	public static void openBrowser()
	
	{
		//loading the browser
		driver=browserEngine.browserConfig();
	}
	
	@Test
	
	public static void RegistrationpageValidation()
	
	{
		//opening process of the registration page
		driver.get(testData.homepageURL);
		driver.findElement(By.xpath(testData.fromhomepagetoregpage)).click();
		
		//validating process of reg page
		String regpageactualTitle=driver.getTitle();
		
		AssertJUnit.assertEquals(regpageactualTitle, testData.regpageexpectedTitle);
		
		//select a language
		new Select(driver.findElement(By.name("language"))).selectByIndex(1);
		
		//select a title
		new Select(driver.findElement(By.name("titles"))).selectByIndex(3);
		
		//select a course
		new Select(driver.findElement(By.name("course"))).selectByIndex(1);
		
		//identify the fname
		driver.findElement(By.name("fname")).sendKeys(testData.regpageFname);
		
		//identify the lname
		driver.findElement(By.name("lname")).sendKeys(testData.regpageLname);
		
		//identify the email
		driver.findElement(By.name("email")).sendKeys(testData.regpageEmail);
		
		//identify the password
		driver.findElement(By.name("password")).sendKeys(testData.regpagePassword);
		
		//identify the phone
		driver.findElement(By.name("phone")).sendKeys(testData.regpagePhone);
		
		//select a gender
		driver.findElements(By.name("gender")).get(1).click();
		
		//select the check box
		driver.findElement(By.xpath(testData.regpageCheckbox)).click();
		
		//press on submit button
		driver.findElement(By.xpath(testData.regpageSubmitbutton)).click();
		
		//after registration validating process the reg page
		String afterregpageactualTitle=driver.getTitle();
		
		AssertJUnit.assertEquals(afterregpageactualTitle, testData.afterregpageexpectedTitle);
		
		
	}
	

	@AfterMethod
	
	public static void tearDown()
	
	{
		//close the browser
		driver.quit();
	}

}
