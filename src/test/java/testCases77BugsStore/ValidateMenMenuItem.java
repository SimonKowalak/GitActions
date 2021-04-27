package testCases77BugsStore;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects77BugsStore.HomePage;
import resources.base;

public class ValidateMenMenuItem extends base {
	public WebDriver driver;

	@BeforeTest
	public void testSetup() throws IOException {
		driver = setup();
	}

	@Test
	public void ValidateMenMMenuItem() {
		driver.get("http://www.77bugs.pl/shop/");
		HomePage homePage = new HomePage(driver);

		// get text of menu item and validate it
		String men = homePage.getMenText().getText();
		Assert.assertTrue(men.equals("MEN"));
		System.out.println("Menu item text MEN validated");
		System.out.println("Menu item text MEN validated2");
		System.out.println("Menu item text MEN validated3");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
}
