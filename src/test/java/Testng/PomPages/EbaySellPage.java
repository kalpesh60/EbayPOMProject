package Testng.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbaySellPage {
	WebDriver driver;
	
	@FindBy(linkText = "Sell")
	WebElement Sell;
	
	@FindBy(xpath = "//*[@id=\"image_banner_3\"]/div/div/a")
	WebElement item;
	
	public EbaySellPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
		
		public void clickOnSell() {
		Sell.click();
		}
		
		public void listAnItem() {
			item.click();
		}
}
