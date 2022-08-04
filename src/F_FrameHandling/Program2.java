package F_FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames");
		
		driver.switchTo().frame("frame1");
		
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello"); //using relative xpath
		
		driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("Ishant");
		
		driver.switchTo().defaultContent();
		

	}

}
