package module4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SAlert {

	public static void main(String[] args) throws InterruptedException {
		
		//Open Browser
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		//Get the URL
		driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
		
		//Click on the button to open the Alert
		driver.findElement(By.id("alert")).click();
			
		//Innitialize your Alert Interface and Switch to that Alert
		Alert SA = driver.switchTo().alert();
		
		//Accept the alert
		SA.accept();
		
	}

}
