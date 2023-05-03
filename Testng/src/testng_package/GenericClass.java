package testng_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericClass
{
	WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 driver=new FirefoxDriver();
		
	}
		 
		 
	
	@AfterMethod
	public void closeapp()
	{
		
		
		
	}
	

}
