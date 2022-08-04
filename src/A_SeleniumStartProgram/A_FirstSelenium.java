package A_SeleniumStartProgram;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_FirstSelenium {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\TestingSoftware\\chromedriver_win32");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//driver.get wait till the whole page load
		driver.manage().window().maximize();
		
		//...........................................................................
		//This is for get the title of the page
		String s=driver.getTitle();
		System.out.println(s);
				//OR
		System.out.println(driver.getTitle());
		
		
		//...........................................................................
		//This for the get the current URL
		String s1=driver.getCurrentUrl();
		System.out.println(s1);
				//OR
		System.out.println(driver.getCurrentUrl());
		
		
		//...........................................................................
		//This is for get the Attribute which is present in dom
		//WebElement ele=driver.findElement(By.id("divontheleft"));
		//System.out.println(ele.getAttribute("class").toString());
		
		driver.close();
	}

}
