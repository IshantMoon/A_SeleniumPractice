package TestNG;

import org.testng.annotations.Test;

public class F_Priority2 {
	
	// In this program we mentioned the priority, so program execute priority wise, highest priority is zero
	
	@Test(priority=0)
	public void q() {
		System.out.println("This is Q method");
	}
	
	@Test(priority=1)
	public void p() {
		System.out.println("This is P method");
	}
	
	@Test(priority=2)
	public void r() {
		System.out.println("This is R method");
	}
}
