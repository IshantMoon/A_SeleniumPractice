package A_SeleniumStartProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D_GetOptions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
		//for display all the webElement in console which is present in drop down list
		
		
		Select s= new Select(driver.findElement(By.name("searchSystemUser[userType]")));
		List<WebElement> option=s.getOptions();
		for(WebElement e:option)
		{
			System.out.println(e.getText());
		}

	}

}
