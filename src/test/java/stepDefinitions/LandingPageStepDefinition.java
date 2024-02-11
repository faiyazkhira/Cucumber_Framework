package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinition {
	public String landingPageProductName;
	public WebDriver driver;
	TestContextSetup testContextSetup;
	LandingPage landingPage;

	public LandingPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;

	}

	@Given("User is on landing page")
	public void user_is_on_landing_page() {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^User searches with shortName (.+) and extract actual name of product$")
	public void user_searches_with_short_name_and_extract_actual_name_of_product(String shortName)
			throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
		landingPage.searchProduct(shortName);
		Thread.sleep(2000);
		testContextSetup.landingPageProductName = landingPage.getSearchText().split("-")[0].trim();
	}

	@And("^User adds (.+) items of the selected product to the cart$")
	public void user_adds_items_of_the_selected_product_to_the_cart(int quantity) {
		testContextSetup.pageObjectManager.landingPage.addItemsToCart();
	}

}
