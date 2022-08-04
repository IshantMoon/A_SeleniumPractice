package F_FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames");
		
		
		int count=driver.findElements(By.tagName("iframe")).size();
		System.out.println(count);

	}

}
