package G_DynamicTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/dynamic-table");
		Thread.sleep(5000);
		
		List<WebElement> ele=driver.findElements(By.xpath("//table[@id='table']/tbody/tr[4]/td"));
		Thread.sleep(5000); //ha thread.sleep aplyala value dynamically change nahi hou denar. bcz dynamuc table che value  shuffle hot rahte
		
		for(WebElement e:ele) {
			System.out.println("The WebElement present:"+e.getText());
		}
		
		driver.close();
	}

}
