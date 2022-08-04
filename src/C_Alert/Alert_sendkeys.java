package C_Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_sendkeys {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.findElement(By.name("prompt")).click();
		Thread.sleep(3000);
		
		//Alert a=driver.switchTo().alert();
		//a.sendKeys("Ishant");
				
					//OR
		driver.switchTo().alert().sendKeys("Ishant");

	}

}
