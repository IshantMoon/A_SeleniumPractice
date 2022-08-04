package TestNG;

import org.testng.annotations.Test;

public class E_Priority1 {
	
	//In this class We didn't mentioned the priority, so program execute the alphabetic wise.
	
	@Test
	public void q() {
		System.out.println("Thsi is Q method");
	}
	
	@Test
	public void p() {
		System.out.println("This is P method");
	}
	
	@Test
	public void r() {
		System.out.println("This is R method");
	}
}
