package testCases77BugsStore;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects77BugsStore.CartPage;
import pageObjects77BugsStore.CheckoutPage;
import pageObjects77BugsStore.HomePage;
import pageObjects77BugsStore.ProductBrownShoesPage;
import resources.base;

public class ValidateProductPricePlaceOrder extends base {

	public WebDriver driver;

	@BeforeTest
	public void testSetup() throws IOException {
		driver = setup();
	}

	@Test
	public void validateProductPricePlaceOrder() throws InterruptedException {
		driver.get("http://www.77bugs.pl/shop/");
		HomePage homePage = new HomePage(driver);
		ProductBrownShoesPage productBrownShoesPage = new ProductBrownShoesPage(driver);
		CartPage cartPage = new CartPage(driver);
		CheckoutPage checkoutPage = new CheckoutPage(driver);

		// click on product image-link
		homePage.goToBrownShoesProductImage().click();
		// get price of this product
		String productBrownShoesPageToString = productBrownShoesPage.getPriceFieldBrownShoes().getText();
		// click on add to cart
		productBrownShoesPage.addToCartBrownShoesButton().click();
		// click on proceed to checkout
		cartPage.goToProceedToCheckoutButton().click();
		// get price of this product second time
		String checkoutBrownShoesPageToString = checkoutPage.getProductPriceFieldCheckoutPage().getText();
		// compare twice grab prices
		Assert.assertTrue(productBrownShoesPageToString.equals(checkoutBrownShoesPageToString));
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
}