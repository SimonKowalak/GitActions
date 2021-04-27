package pageObjects77BugsStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By shoesItem = By.xpath("//li[@id='menu-item-96']/a");
	By menItem = By.xpath("//li[@id='menu-item-97']/a");
	By womanItem = By.xpath("//li[@id='menu-item-100']/a");
	By sportItem = By.xpath("//li[@id='menu-item-99']/a");
	By otherItem = By.xpath("//li[@id='menu-item-98']/a");
	By brownShoes = By.xpath("//a[@href='http://www.77bugs.pl/product/brown-shoes-for-the-winter-autumn-period/']");
	By productPriceHomePage = By.xpath(
			"//main[@id='main']//h2[text()='Brown shoes for the winter/autumn period']//following-sibling::span//bdi");

	public WebElement getShoesText() {
		return driver.findElement(shoesItem);
	}

	public WebElement getMenText() {
		return driver.findElement(menItem);
	}

	public WebElement getWomanText() {
		return driver.findElement(womanItem);
	}

	public WebElement getSportText() {
		return driver.findElement(sportItem);
	}

	public WebElement getOtherText() {
		return driver.findElement(otherItem);
	}

	public WebElement goToBrownShoesProductImage() {
		return driver.findElement(brownShoes);
	}

	public WebElement getProductPriceFieldHomePage() {
		return driver.findElement(productPriceHomePage);
	}
}
