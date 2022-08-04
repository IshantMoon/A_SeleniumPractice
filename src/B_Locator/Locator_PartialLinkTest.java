package B_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_PartialLinkTest {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("New pro")).click();

	}

}
