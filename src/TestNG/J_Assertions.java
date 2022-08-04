package TestNG;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class J_Assertions {
	
	//The program for hard Assertion, assert is a class
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void SetUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");	
	}
	
	@Test
	public void verifyTheTitleOfPage() {
		String s=driver.getTitle();
		//System.out.println(s);
		String expectedValue="Google";
		Assert.assertEquals(s, expectedValue); //if this will fail never execute next line of code other wise it will execute
		System.out.println("I am Ishant");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
