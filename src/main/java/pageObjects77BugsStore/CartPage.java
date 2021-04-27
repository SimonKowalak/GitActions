package pageObjects77BugsStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	By proceedToCheckout = By.xpath("//a[@href='http://www.77bugs.pl/checkout/']");
	By productPriceBrownShoesCartPage = By.xpath("//td[@class='product-price']/span/bdi");

	public WebElement goToProceedToCheckoutButton() {
		return driver.findElement(proceedToCheckout);
	}

	public WebElement getPriceBrownShoesCartPage() {
		return driver.findElement(productPriceBrownShoesCartPage);
	}
}