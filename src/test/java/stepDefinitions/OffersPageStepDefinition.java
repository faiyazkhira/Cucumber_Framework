package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import utils.TestContextSetup;

public class OffersPageStepDefinition {
	public String offersPageProductName;
	TestContextSetup testContextSetup;

	public OffersPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}

	@Then("^User searches for the same shortName (.+) in offers page$")
	public void user_searches_for_the_same_short_name_to_check_if_product_exists(String shortName)
			throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		OffersPage offersPage = testContextSetup.pageObjectManager.getOffersPage();
		LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
		landingPage.getOffersPage();
		switchToOffersPage();
		offersPage.searchProduct(shortName);
		Thread.sleep(2000);
		offersPageProductName = offersPage.getSearchText();

	}

	public void switchToOffersPage() {
		testContextSetup.genericUtils.SwitchToChildWindow();
	}

	@Then("validate product name in offers page matches with landing page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {
		Assert.assertEquals(offersPageProductName, testContextSetup.landingPageProductName);
	}
}
