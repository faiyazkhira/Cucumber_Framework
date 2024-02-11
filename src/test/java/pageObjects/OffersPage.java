package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
	private By topDeals = By.cssSelector("a[href='#/offers']");
	private By search = By.cssSelector("input[type='search']");
	private By productName = By.xpath("//tr/td[1]");
	public WebDriver driver;

	public OffersPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getSearchText() {
		return driver.findElement(By.xpath("//tr/td[1]")).getText();

	}

	public void searchProduct(String name) {
		driver.findElement(search).sendKeys(name);
	}
}
