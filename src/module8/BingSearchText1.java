package module8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingSearchText1 {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.bing.com");

		BingHomePageObjects1 page1 = new BingHomePageObjects1(driver);

		page1.SearchBing("SeleniumHQ");
		page1.clickSel();

		SeleniumHomePageObjects page2 = new SeleniumHomePageObjects(driver);
		
		page2.DownloadClick();
		Thread.sleep(5000);
		page2.HomeClick();
		Thread.sleep(5000);
		
		driver.quit();
	}

}