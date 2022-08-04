package G_DynamicTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/dynamic-table");
		
		List<WebElement> eList=driver.findElements(By.xpath("//table[@id='table']/tbody/tr[4]/td"));
		System.out.println(eList.size());
		
		driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]/input")).click();
		
		

	}

}
