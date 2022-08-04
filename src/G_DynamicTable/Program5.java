package G_DynamicTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program5 {

	public static void main(String[] args) {
		
		// table madhalya cheack box var click karayche ahe
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/dynamic-table");
		
		driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]/input")).click();

 }
}
