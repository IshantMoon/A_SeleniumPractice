package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A_AnotationsExecutionSequence {

	@BeforeClass
	public void beforeClass() {
		System.out.println("This is the @BeforeClass Anotations");
	} 
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is the @AfterClass Anotations");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is the @BeforeTest Anotations");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is the @AfterTest Anotations");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is the @BeforeMethod Anotations");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is the @AfterMethod Anotations");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is the @BeforeSuite Anotations");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is the @AfterSuite Anotations");
	}
	
	@Test
	public void testCase() {
		System.out.println("This is the @Test Anotations for we use Test case");
	}
}
