package Testng.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayElectronicsPage {
	WebDriver driver;

	@FindBy(xpath = "//input[@placeholder='Search for anything']")
	WebElement Search;

	@FindBy(xpath = "//input[@id='gh-btn']")
	WebElement clickOnSearch;

	@FindBy(xpath = "//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/a/h3/span")
	WebElement mobile;

	public EbayElectronicsPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}

	public void searchElect(String arg) {
	Search.sendKeys(arg);
	}
	
	public void clickOnSearch() {
	clickOnSearch.click();
	}
	
	public void clickOnMobile() {
	mobile.click();
	}
}
