package seleniumBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	@Test
	public void sampleTestCase()
	{
		System.out.println("Sample TestCase....");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method.....");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method......");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before test..........");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After test......");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class.......");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class.........");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite........");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After suite............");
	}
	

}
