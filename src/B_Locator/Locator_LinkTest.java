package B_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_LinkTest {

	public static void main(String[] args) {

		    WebDriver driver = new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			
			driver.findElement(By.linkText("Specials")).click();


	}

}
