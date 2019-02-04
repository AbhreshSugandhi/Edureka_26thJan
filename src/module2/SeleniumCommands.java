package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * Created by Abhresh
 */


public class SeleniumCommands {

	public static void main(String[] args) {
		
		//Instantantate the Browser OR Open A Browser OR Browser Initialization
		//Chrome Browser
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Firefox Browser
		System.setProperty("webdriver.gecko.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		
		//Close and Quit Browser
		driver.close();//this will close the current active window within this instance
		driver.quit();//this will close all the windows within this instance
		
		//Get Commands
		driver.get("URL");// to open a URL of an AUT
		driver.getCurrentUrl();// to get the current URL of the AUT
		driver.getTitle();// to get the title of the current page
		driver.getWindowHandle();// this gives you window name
		
		//Navigation Commands
		driver.navigate().to("URL");// to open URL
		driver.navigate().forward();//to go to next executed page
		driver.navigate().back();//to go to previous executed page
		driver.navigate().refresh();//to refresh the page
		
		
		//Element handling commands
		driver.findElement(By.id("")).click();
		driver.findElement(By.id("")).sendKeys("Abhresh");
		driver.findElement(By.id("")).clear();
		

	}

}
