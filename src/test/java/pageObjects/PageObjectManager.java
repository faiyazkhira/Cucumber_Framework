package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public LandingPage landingPage;
	public WebDriver driver;
	public OffersPage offersPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public LandingPage getLandingPage() {
		return landingPage = new LandingPage(driver);
	}

	public OffersPage getOffersPage() {
		return offersPage = new OffersPage(driver);
	}

}
