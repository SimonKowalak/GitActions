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
import pageObjects77BugsStore.OrderPage;
import pageObjects77BugsStore.ProductBrownShoesPage;
import resources.base;

public class ValidateProductPriceAfterPlaceOrder extends base {
	public WebDriver driver;

	@BeforeTest
	public void testSetup() throws IOException {
		driver = setup();
	}

	@Test
	public void validateProductPriceAfterPlaceOrder() {
		driver.get("http://www.77bugs.pl/shop/");
		HomePage homePage = new HomePage(driver);
		ProductBrownShoesPage productBrownShoesPage = new ProductBrownShoesPage(driver);
		CartPage cartPage = new CartPage(driver);
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		OrderPage orderPage = new OrderPage(driver);

		// click on product image-link
		homePage.goToBrownShoesProductImage().click();

		// get price of this product
		String priceBrownShoesString = productBrownShoesPage.getPriceFieldBrownShoes().getText();
		// click on add to cart
		productBrownShoesPage.addToCartBrownShoesButton().click();
		// click on proceed to checkout
		cartPage.goToProceedToCheckoutButton().click();

		// fill form fields
		checkoutPage.fillFirstName().sendKeys("Peter");
		checkoutPage.fillLastName().sendKeys("Nowacki");
		checkoutPage.fillAddress().sendKeys("Example Street 123/10");
		checkoutPage.fillPostCode().sendKeys("11111");
		checkoutPage.fillCityName().sendKeys("Warsaw");
		checkoutPage.fillPhoneNr().sendKeys("111 111 111");
		checkoutPage.fillEmail().sendKeys("example@example.com");
		// click on place order
		checkoutPage.clickOnPlaceOrderButton().click();
		// get price of this product second time
		String priceOrderPageBrownShoesString = orderPage.getPriceOnOrderPage().getText();
		// compare twice grab prices
		Assert.assertTrue(priceBrownShoesString.equals(priceOrderPageBrownShoesString));
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
}