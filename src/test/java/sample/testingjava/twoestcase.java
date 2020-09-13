package sample.testingjava;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class twoestcase {
	
	@AfterTest
	public void afterat()
	{
		System.out.println("this is after Test");
	}
	@BeforeMethod
	public void Bmethod()
	{
		System.out.println("before method in 2nd class");
	}
	@AfterMethod
	public void Amethod()
	{
		System.out.println("After method in 2nd class");
	}
	@Test(priority=0,alwaysRun=true,dataProvider="nameofdatapro",dataProviderClass=secondclass.class,dependsOnMethods="accountcreation",description="testcasename",enabled=true,invocationCount=10,invocationTimeOut=60)
	public void login()
	{
		System.out.println("this is test case in 2nd class");
	}

	@Test(priority=1)
	public void accountcreation()
	{
		System.out.println("this is test case 2 in 2nd class");
	}


}
