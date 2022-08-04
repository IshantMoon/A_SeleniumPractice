package B_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Name {

	public static void main(String[] args) {
		

		    WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
			
			
			driver.findElement(By.name("txtUsername")).sendKeys("Admin");
			driver.findElement(By.name("txtPassword")).sendKeys("admin123");
			driver.findElement(By.name("Submit")).click();
			

	}

}
