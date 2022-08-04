package D_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Hover {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		Actions action=new Actions(driver);
		
		WebElement element=driver.findElement(By.id("sub-menu"));
		action.moveToElement(element).build().perform();
		
		WebElement element2=driver.findElement(By.id("link2"));
		action.moveToElement(element2).click(element2).build().perform();
	}

}
