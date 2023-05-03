package testng_package;

import org.testng.annotations.Test;

public class Invocationcount 
{
	@Test(invocationCount=3)
	public void test2()
	{
		System.out.println("signup");
	}
	@Test
	public void test3()
	{
		System.out.println("login");
	}



}
