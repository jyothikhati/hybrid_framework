package testng_package;

import org.testng.annotations.Test;

public class Sampleclass extends GenericClass

{
	//driver
	//@BM
	//AM
	
	@Test
	public void test1()
	{
		driver.get("https://www.facebock.com");
		driver.findElement(By.id("email")).sendkeys("abc");
		driver.findElement(By.id("pass")).sendkeys("12345");
		driver.findElement(By.id("login")).click();
		

	}
	

}
