package module5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
			
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class = '_2AkmmA _29YdH8']")).click();
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Jackets");
		
		driver.findElement(By.xpath("//*[@class = 'vh79eN' and @type = 'submit']")).click();
		
		WebElement MH = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/div/a/div[1]/div/div/div/img"));

		Actions act = new Actions(driver);
		
		act.moveToElement(MH).build().perform();
		
	}

}









