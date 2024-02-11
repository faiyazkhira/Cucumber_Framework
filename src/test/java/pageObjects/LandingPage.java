package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	private By search = By.cssSelector("input[type='search']");
	private By productName = By.cssSelector("h4[class='product-name']");
	private By addItems = By.className("increment");
	private By addToCart = By.xpath("//button[text()='ADD TO CART']");

	public void searchProduct(String name) {
		driver.findElement(search).sendKeys(name);
	}

	public String getSearchText() {
		return driver.findElement(productName).getText();

	}

	public void getOffersPage() {
		driver.findElement(By.cssSelector("a[href='#/offers']")).click();
	}

}
