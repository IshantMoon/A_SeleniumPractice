package TestNG;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class D_TestCase3 {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");		
		}
	
	@Test
	public void verifyTitleOfPage() {
		String s=driver.getTitle();
		System.out.println("The Title of page is : "+s);
		
		String expectedTitle="Practice handling Alerts in selenium webdriver";
		Assert.assertEquals(s, expectedTitle);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
