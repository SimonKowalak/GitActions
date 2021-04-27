package pageObjects77BugsStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage {
	WebDriver driver;

	public OrderPage(WebDriver driver) {
		this.driver = driver;
	}

	By getPriceOrderPage = By.xpath(
			"//div[@class='woocommerce-order']//li[@class='woocommerce-order-overview__total total']/strong/span/bdi");

	public WebElement getPriceOnOrderPage() {
		return driver.findElement(getPriceOrderPage);
	}
}
