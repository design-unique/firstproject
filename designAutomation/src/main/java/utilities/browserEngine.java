package utilities;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserEngine {
	
	public static WebDriver driver;
	
	public static WebDriver browserConfig()
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\DigitalPoint Project\\MavenProject\\28NOV22\\designAutomation\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		System.out.println("opened chrome browser");
		
		//System.setProperty("webdriver.gecko.driver", "D:\\DigitalPoint Project\\MavenProject\\28NOV22\\designAutomation\\drivers\\geckodriver.exe");
		//driver=new FirefoxDriver();
		
		//System.out.println("opened firefox browser");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//maximize window with setsize(300,1080)
		//Dimension d=new Dimension(300,1080);
		//driver.manage().window().setSize(d);
		
		//delete all cookies from the browser
		driver.manage().deleteAllCookies();
		return driver;
		
	}

}
