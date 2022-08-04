package TestNG;

import org.testng.annotations.Test;

public class G_Priority3 {
	
	//In this program we mentioned the same priority, so program execute alphabetically wise.
	
	@Test(priority=3)
	public void q() {
		System.out.println("This is Q method");
	}
	
	@Test(priority=3)
	public void p() {
		System.out.println("This is P method");
	}
	
	@Test(priority=3)
	public void r() {
		System.out.println("This is R method");
	}

}
