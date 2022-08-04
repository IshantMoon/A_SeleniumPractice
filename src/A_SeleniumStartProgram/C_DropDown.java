package A_SeleniumStartProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C_DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		//Using ByVisibleText, ByValue, ByIndexValue we can find element in drop down list
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
		//.....................................................................................
		//Using selectByVisibleText find drop down list element
		
		Select s=new Select(driver.findElement(By.name("searchSystemUser[userType]")));
		s.selectByVisibleText("ESS");
		Thread.sleep(5000);
		
		//.....................................................................................
		//using SelectByValue
		Select s1= new Select(driver.findElement(By.name("searchSystemUser[userType]")));
		s1.selectByValue("Admin");
		Thread.sleep(5000);
		
		//.....................................................................................
		//using SelectByIndex
		Select s2=new Select(driver.findElement(By.name("searchSystemUser[userType]")));
		s2.selectByIndex(1);
		
		driver.quit();
		
	}

}
