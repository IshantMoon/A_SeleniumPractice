package TestNG;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class C_TestCase2 {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	} 
	
	@Test
	public void display1() {
		driver.findElement(By.name("alert")).click();
	}
	
	@AfterMethod
	public void tearDown() {
	    driver.quit();
	}
}
