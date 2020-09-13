package sample.testingjava;

import org.testng.annotations.*;

public class secondclass {

	@BeforeClass
	public void beforecl()
	{
		System.out.println("this is before class");
	}
	@BeforeTest
	public void beforete()
	{
		System.out.println("this is beforetest");
	}
	
	@BeforeMethod
	public void bmethod()
	{
		System.out.println("this is beforemethod");
	}
	@AfterMethod
	public void Amethod()
	{
		System.out.println("this is aftermethod");
	}
	@Test
	public void testcase1()
	{
		System.out.println("this is testcase");
	}
	@AfterClass
	public void aftercl()
	{
		System.out.println("this is after class");
	}
}
