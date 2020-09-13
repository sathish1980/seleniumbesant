package sample.testingjava;

import org.testng.annotations.*;

public class sampletestng {

	@BeforeSuite
	public void url()
	{
		System.out.println("this is before suite");
	}
	
	@AfterSuite
	public void teardown()
	{
		System.out.println("this is after suite");
	}
	

}
