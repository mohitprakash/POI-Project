package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class Createdriver 
{
	public ChromeDriver f;
	@BeforeMethod
	public void createdr()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohit Prakash\\Desktop\\chromedriver\\chromedriver.exe");
		f = new ChromeDriver();
		f.get("https://www.facebook.com");
				
	}
	
	@AfterMethod
	public void amet()
	{
		f.quit();
	}

}
