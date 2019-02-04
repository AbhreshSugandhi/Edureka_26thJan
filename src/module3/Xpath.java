package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
	
		//Open Browser
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open AUT
		driver.get("https://www.facebook.com/");		
		
		//Enter details in the form using Customized Xpath
		driver.findElement(By.xpath("//input[@id='u_0_j']")).sendKeys("Abhresh");
		
		
		//Select the date using Following and Preceding
		driver.findElement(By.xpath("//*[@name='email']//following::input[1]")).sendKeys("Sugandhi");
		driver.findElement(By.xpath("//*[@name='pass']//preceding::input[1]")).sendKeys("Abhresh");
		
		
		//Select Year
		driver.findElement(By.xpath("//select[@id='month']//following::select/option[3]")).click();
		
		//Select Date
		driver.findElement(By.xpath("//select[@id='month']//preceding::select/option[4]")).click();
		
	}

}
