package B_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Xpath {

	public static void main(String[] args) {
		
		
		// when there is id, name, class name that time x path should use
		//there are two types of x path  1. Absolute xpath     2. Relative xpath
		//1. Absolute xpath: this will find/identify the element from starting of DOM. just click right and you will get option of x path Or full xpath
		//2. Relative x path: this will start from perticular DoM node and we have to write manually xpath.
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");	
		
		
		//Absolute Xpath
		
		//driver.findElement(By.xpath("/html/body/div/div[3]/footer/div/section[3]/ul/li[2]/a")).click();
		
		
		
		//Relative Xpath			
				
		driver.findElement(By.xpath("//a[contains(text(),'Contact us')]")).click();

	}

}
