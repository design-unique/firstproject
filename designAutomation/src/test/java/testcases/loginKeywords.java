package testcases;



import utilities.browserEngine;
import utilities.elementsLocator;
import utilities.testData;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class loginKeywords {
	
	public static WebDriver driver;
	

	  public static void openBrowser() throws InterruptedException 
	{
		//TS_001 open the browser
		driver=browserEngine.browserConfig();
		
		//delay for 2 sec
		Thread.sleep(2000);
	  }
	
    public static void loadAUT() throws InterruptedException 
  {
	  //TS_002 Navigate to Website
	  driver.get(testData.loginpageURL);
	//delay for 2 sec
			Thread.sleep(2000);
  }
  
    public static void loginTitlevalidate() throws InterruptedException
  {
	  //TS_003 Validate login page Title
	  String loginpageactualTitle=driver.getTitle();
	  
	  Assert.assertEquals(loginpageactualTitle, testData.loginpageexpectedTitle);
	  
	//delay for 2 sec
		Thread.sleep(2000);
  }
  
    public static void loginFunctionality()
  {
	  //TS_004 Login Functionality
	  //input_id	  
	  driver.findElement(elementsLocator.loginUID).sendKeys(testData.loginUIDemail);
	  
	  //input_pw
	  driver.findElement(elementsLocator.loginPW).sendKeys(testData.loginPW);
	  
	  //click on check box
	  driver.findElement(elementsLocator.loginCheckboxlink).click();
	  
	  //click_Login
	  driver.findElement(elementsLocator.loginSigninlink).click();

  }
  
    public static void afterloginTitlevalidate()
  {
	  //TS_005 Validate after login page Title
	  String afterloginactualTitle=driver.getTitle();
	  
	  Assert.assertEquals(afterloginactualTitle, testData.afterloginpageexpectedTitle);

  }
  
   public static void logoutFunctionality()
  {
	  //TS_006 Logout Functionality
	  
	  //Click on Drop Down
	  driver.findElement(elementsLocator.lougoutDropdown).click();
	  
	  //Click on Logout
	  driver.findElement(elementsLocator.logoutButton).click();
  }  

   public static void closeBrowser() 
  {
	  //TS_007 Close the Browser
	  //driver.close();
  }

}
