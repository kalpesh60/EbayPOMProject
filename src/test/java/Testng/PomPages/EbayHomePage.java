package Testng.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayHomePage {
	WebDriver driver;
	@FindBy(xpath = "//input[@placeholder='Search for anything']")
	WebElement Search;
	
	@FindBy(linkText = "Electronics")
	WebElement electronics;
	
	@FindBy(linkText = "Sports")
	WebElement sports;

	public EbayHomePage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}

	public void searchBar(String arg) {
	Search.sendKeys(arg);
	}
	
	public void clickOnElectronics() {
	electronics.click();
	}
	
	public void clickOnSports() {
		sports.click();
		}
}