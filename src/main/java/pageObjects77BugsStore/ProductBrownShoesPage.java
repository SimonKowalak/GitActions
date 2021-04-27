package pageObjects77BugsStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductBrownShoesPage {
	WebDriver driver;

	public ProductBrownShoesPage(WebDriver driver) {
		this.driver = driver;
	}

	By PriceBrownShoes = By.xpath("//p[@class='price']//bdi");
	By ToCartBrownShoes = By.xpath("//button[@value='75']");

	public WebElement getPriceFieldBrownShoes() {
		return driver.findElement(PriceBrownShoes);
	}

	public WebElement addToCartBrownShoesButton() {
		return driver.findElement(ToCartBrownShoes);
	}
}
