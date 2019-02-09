package module4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PAlert {

	public static void main(String[] args) {

		// Open Browser
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Get the URL
		driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");

		// Click on the button to open the Alert
		driver.findElement(By.id("prompt")).click();

		// Innitialize your Alert Interface and Switch to that Alert
		Alert PA = driver.switchTo().alert();
		
		//Type in the text Box
		PA.sendKeys("Abhresh Sugandhi");
		
		//Accept it
		PA.accept();

	}

}
