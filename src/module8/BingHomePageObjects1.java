package module8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingHomePageObjects1 {

	public BingHomePageObjects1(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="q")
	WebElement txtsearch;
	
	@FindBy(name="go")
	WebElement btnSearch;
	
	@FindBy(linkText = "Selenium - Web Browser Automation")
	WebElement clickLink;

	public void SearchBing(String searchtxt) {
		
		// Enter text in the Search Bar
		txtsearch.sendKeys(searchtxt);

		// Click on the search button
		btnSearch.click();
	}
	
	public void clickSel() {
		
		clickLink.click();
	}
	
	
}
