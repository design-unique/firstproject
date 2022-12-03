package utilities;

import org.openqa.selenium.By;

public class elementsLocator {
	
	//log in page findelement items
	
	public static By loginUID=By.name("email");
	
	public static By loginPW=By.name("password");
	
	public static By loginCheckboxlink=By.xpath("/html/body/div[2]/div/div/form/div/div[2]/div[3]/div[1]/div/label/div/span/input");
	
	public static By loginSigninlink=By.xpath("/html/body/div[2]/div/div/form/div/div[2]/div[3]/div[2]/button");
	
	public static By lougoutDropdown=By.xpath("//*[@id=\'navbar-right\']/li/a");
	
	public static By logoutButton=By.xpath("//*[@id=\'navbar-right\']/li/ul/li/a");

}
