package module6;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority = 1)
	public void Shifali() {
		System.out.println("This is the Test Case 1");
	}

	@Test(priority = 1)
	public void Jacob() {
		System.out.println("This is the Test Case 2");
	}

	@Test(priority = 11111)
	public void Kalaivani() {
		System.out.println("This is the Test Case 3");
	}

	@Test(priority = 434)
	public void Namrata() {
		System.out.println("This is the Test Case 4");
	}
	
	@Test(priority = 338236)
	public void Tavish() {
		System.out.println("This is the Test Case 5");
	}
}
