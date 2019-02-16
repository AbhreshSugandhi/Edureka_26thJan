package module6;

import org.testng.annotations.Test;

public class DisableEnable {

	@Test(priority = 2)
	public void Shifali() {
		System.out.println("This is the Test Case 1");
	}

	@Test(priority = 0)
	public void Jacob() {
		System.out.println("This is the Test Case 2");
	}

	@Test(priority = 3)
	public void Kalaivani() {
		System.out.println("This is the Test Case 3");
	}

	@Test(priority = 6, enabled = false)
	public void Namrata() {
		System.out.println("This is the Test Case 4");
	}
	
	@Test(priority = 8)
	public void Tavish() {
		System.out.println("This is the Test Case 5");
	}
}
