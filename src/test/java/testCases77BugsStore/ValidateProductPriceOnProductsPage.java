package testCases77BugsStore;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects77BugsStore.HomePage;
import pageObjects77BugsStore.ProductBrownShoesPage;
import resources.base;

public class ValidateProductPriceOnProductsPage extends base {

	public WebDriver driver;

	@BeforeTest
	public void testSetup() throws IOException {
		driver = setup();
	}

	@Test
	public void validateProductPriceOnProductsPage() throws InterruptedException {
		driver.get("http://www.77bugs.pl/shop/");
		HomePage homePage = new HomePage(driver);
		ProductBrownShoesPage productBrownShoesPage = new ProductBrownShoesPage(driver);

		// click on product image-link
		homePage.goToBrownShoesProductImage().click();
		// get price of this product
		String productPriceBrownShoesPageToString = productBrownShoesPage.getPriceFieldBrownShoes().getText();
		// go back
		driver.navigate().back();
		// get price of this product second time
		String productPriceFieldHomePageToString = homePage.getProductPriceFieldHomePage().getText();
		// compare twice grab prices
		Assert.assertTrue(productPriceBrownShoesPageToString.equals(productPriceFieldHomePageToString));
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
}