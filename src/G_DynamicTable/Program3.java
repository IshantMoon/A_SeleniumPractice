package G_DynamicTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/dynamic-table");
		
		
		List<WebElement> ele=driver.findElements(By.xpath("//table[@id='table']/tbody/tr/td[2]"));
		
		for(WebElement e:ele) {
			System.out.println("column data is:" +e.getText());
		}

	}

}
