package TestNG;

import org.testng.annotations.Test;

public class H_Priority4 {
	
	@Test(priority=-99)
	public void q() {
		System.out.println("This is Q method");
	}
	
	@Test(priority=-8)
	public void p() {
		System.out.println("This is P method");
	}
	
	@Test(priority=-9)
	public void r() {
		System.out.println("This is R method");
	}
}
