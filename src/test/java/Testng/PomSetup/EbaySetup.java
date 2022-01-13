package Testng.PomSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Testng.PomPages.EbayElectronicsPage;
import Testng.PomPages.EbayHomePage;
import Testng.PomPages.EbaySellPage;
import Testng.PomPages.EbaySportsPage;

public class EbaySetup {
	WebDriver driver;

	@BeforeTest(groups = {"sports", "electronics"})
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "/Users/kalpe/eclipse-workspace/SeleniumConcepts/Driver1/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.ebay.com/");
	}

	@Test(priority = 1, groups = "electronics")
	public void navigate_to_homepage_click_on_SearchBar() {
	EbayHomePage objEbayHomePage = new EbayHomePage(driver);
	objEbayHomePage.searchBar("apple");
	objEbayHomePage.clickOnElectronics();
	}

	@Test(priority = 2, groups = "electronics")
	public void electronicsPage() {
	EbayElectronicsPage objElectronicsPage = new EbayElectronicsPage(driver);
	objElectronicsPage.searchElect("mobiles");
	objElectronicsPage.clickOnSearch();
	objElectronicsPage.clickOnMobile();
	}
	
	@Test(priority = 3)
	public void sellPage() {
	EbaySellPage objsellPage = new EbaySellPage(driver);
	objsellPage.clickOnSell();
	objsellPage.listAnItem();
	}
	
	@Test(priority = 4, groups = "sports")
	public void sportsPage() {
		EbaySportsPage objEbaySportsPage = new EbaySportsPage(driver);
		objEbaySportsPage.logo();
		objEbaySportsPage.searchSports("SportsShoes");
		objEbaySportsPage.clickOnSearch();
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
