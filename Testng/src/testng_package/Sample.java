package testng_package;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample 
{
	@Test
	public void test1()
	{
		Reporter.log("hello",true);
	}

}
