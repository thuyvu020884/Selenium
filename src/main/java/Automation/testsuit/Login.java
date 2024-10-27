package Automation.testsuit;

import org.testng.annotations.*;

public class Login{
	@BeforeMethod
	public void init()
	{
		System.out.println ("This is before method");
	}
	@Test
	public void testcase1()
	{
		System.out.println ("This is testcase1");
	}
}