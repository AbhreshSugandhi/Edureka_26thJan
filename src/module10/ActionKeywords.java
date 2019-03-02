package module10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords {

	static WebDriver driver;

	public static void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void Navigate() {
		driver.get("https://www.google.com/");
	}

	public static void ClickGmail() {
		driver.findElement(By.linkText("Gmail")).click();
	}
}
