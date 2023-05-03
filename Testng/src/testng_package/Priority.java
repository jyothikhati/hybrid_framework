package testng_package;

import org.testng.annotations.Test;

public class Priority 
{
	@Test(priority=3)
	public void test1()
	{
		System.out.println("logout");
	}
	@Test(priority=1)
	public void test2()
	{
		System.out.println("signup");
	}
	@Test(priority=2)
	public void test3()
	{
		System.out.println("login");
	
	}

}
