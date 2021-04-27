package pageObjects77BugsStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
	WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}

	By firstName = By.xpath("//input[@id='billing_first_name']");
	By lastName = By.xpath("//input[@id='billing_last_name']");
	By address = By.xpath("//input[@id='billing_address_1']");
	By postCode = By.xpath("//input[@id='billing_postcode']");
	By cityName = By.xpath("//input[@id='billing_city']");
	By phoneNr = By.xpath("//input[@id='billing_phone']");
	By email = By.xpath("//input[@id='billing_email']");
	By productPriceCheckout = By.xpath("//td[@class='product-total']//bdi");
	By placeOrder = By.xpath("//button[@id='place_order']");

	public WebElement fillFirstName() {
		return driver.findElement(firstName);
	}

	public WebElement fillLastName() {
		return driver.findElement(lastName);
	}

	public WebElement fillAddress() {
		return driver.findElement(address);
	}

	public WebElement fillPostCode() {
		return driver.findElement(postCode);
	}

	public WebElement fillCityName() {
		return driver.findElement(cityName);
	}

	public WebElement fillPhoneNr() {
		return driver.findElement(phoneNr);
	}

	public WebElement fillEmail() {
		return driver.findElement(email);
	}

	public WebElement getProductPriceFieldCheckoutPage() {
		return driver.findElement(productPriceCheckout);
	}

	public WebElement clickOnPlaceOrderButton() {
		return driver.findElement(placeOrder);
	}
}
