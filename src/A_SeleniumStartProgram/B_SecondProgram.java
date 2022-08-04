package A_SeleniumStartProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_SecondProgram {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");//driver.navigate().to not wait till whole page load
		
		Thread.sleep(5000);
		 
		driver.navigate().back(); //this is use to go one step  back
		
		Thread.sleep(5000);
		
		driver.navigate().forward(); //this is use to one step forward
		
	}

}
