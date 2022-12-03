package testcases;

import org.testng.annotations.Test;

import utilities.readData;
import utilities.testData;
import java.io.IOException;


public class loginFunctionalityRunner {
	
  @Test
  public static void userLogin() throws IOException, InterruptedException 
  {
	  //Declaring the path of the Excel file with the name of the Excel file
	  String filepath = testData.externaldataPath;
	
	  //Here we are passing the Excel path and SheetName as arguments to connect with Excel file
	  readData.readexcelData(filepath, "Sheet1");
	  
	  for (int iRow=1; iRow<=7; iRow++)
	  {
		  String keywords = readData.readcellData(iRow,3);
		  
		//Comparing the value of Excel cell with all the keywords in the "Actions" class		  
		  if (keywords.equals("openBrowser"))
		  {
			  loginKeywords.openBrowser();
		  }
		  else if (keywords.equals("loadAUT"))
		  {
			  loginKeywords.loadAUT();
		  }
		  else if (keywords.equals("loginTitlevalidate"))
		  {
			  loginKeywords.loginTitlevalidate();
		  }
		  else if (keywords.equals("loginFunctionality"))
		  {
			  loginKeywords.loginFunctionality();
		  }
		  else if (keywords.equals("afterloginTitlevalidate"))
		  {
			  loginKeywords.afterloginTitlevalidate();
		  }
		  else if (keywords.equals("logoutFunctionality"))
		  {
			  loginKeywords.logoutFunctionality();
		  }
		  else if (keywords.equals("closeBrowser"))
		  {
			  loginKeywords.closeBrowser();
		  }
	  }
  }
  

}
