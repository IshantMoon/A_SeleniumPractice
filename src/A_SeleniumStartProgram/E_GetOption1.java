package A_SeleniumStartProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E_GetOption1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
		//count of webelement in dropdown list in console shows the number
		
		Select s=new Select(driver.findElement(By.name("searchSystemUser[userType]")));
		//List<WebElement> option=s.getOptions();
		//System.out.println(option.size());
		
					//OR
		
		System.out.println(s.getOptions().size());

	}

}
