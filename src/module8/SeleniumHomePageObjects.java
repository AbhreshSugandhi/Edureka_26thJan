package module8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumHomePageObjects {

	public SeleniumHomePageObjects(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText = "Download")
	WebElement clickDownload;
	
	@FindBy(linkText = "Browser Automation")
	WebElement clickHomePage;
	
	
	public void DownloadClick() {
		clickDownload.click();
	}
	
	public void HomeClick() {
		clickHomePage.click();
	}
}
