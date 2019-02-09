package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MDBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();

		driver.findElement(By.name("q")).sendKeys("Jackets");
		
		driver.findElement(By.xpath("//*[@type='submit' and @class='vh79eN']")).click();
		
	}

}
