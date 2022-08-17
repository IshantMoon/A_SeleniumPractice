package A_SeleniumStartProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class G_LinkPresentOnWebpagePrintIT {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		List<WebElement> ele=driver.findElements(By.tagName("a"));
		for(WebElement e:ele) {
			System.out.println(e.getText());
		}

	}

}
