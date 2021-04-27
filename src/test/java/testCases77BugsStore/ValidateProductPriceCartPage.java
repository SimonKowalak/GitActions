package testCases77BugsStore;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects77BugsStore.CartPage;
import pageObjects77BugsStore.HomePage;
import pageObjects77BugsStore.ProductBrownShoesPage;
import resources.base;

public class ValidateProductPriceCartPage extends base {

	public WebDriver driver;

	@BeforeTest
	public void testSetup() throws IOException {
		driver = setup();
	}

	@Test
	public void validateProductPriceCartPage() throws InterruptedException {
		driver.get("http://www.77bugs.pl/shop/");
		HomePage homePage = new HomePage(driver);
		ProductBrownShoesPage productBrownShoesPage = new ProductBrownShoesPage(driver);
		CartPage cartPage = new CartPage(driver);

		// click on product image-link
		homePage.goToBrownShoesProductImage().click();
		// get price of this product
		String productBrownShoesPageToString = productBrownShoesPage.getPriceFieldBrownShoes().getText();
		// click on add to cart
		productBrownShoesPage.addToCartBrownShoesButton().click();
		// get price of this product second time
		String getPriceBrownShoesCartPageToString = cartPage.getPriceBrownShoesCartPage().getText();
		// compare twice grab prices
		Assert.assertTrue(productBrownShoesPageToString.equals(getPriceBrownShoesCartPageToString));
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
}