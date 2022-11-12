package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserEngine {
	
	public static WebDriver driver;
	
	public static WebDriver browserConfig()
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\DigitalPoint Project\\MavenProject\\12NOV22\\ForumAutomation\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		System.out.println("chrome browser opened");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//delete all cookies from the browser
		driver.manage().deleteAllCookies();
		
		return driver;
	}

}
