package Testng.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbaySportsPage {
	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"gh-logo\"]")
	WebElement logo;

	@FindBy(xpath = "//input[@placeholder='Search for anything']")
	WebElement Search;
	
	@FindBy(xpath = "//input[@id='gh-btn']")
	WebElement clickOnSearch;
	
	public EbaySportsPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}

	public void logo() {
		logo.click();
	}
	
	public void searchSports(String arg) {
		Search.sendKeys(arg);
	}
		
		public void clickOnSearch() {
		clickOnSearch.click();
	}
}
