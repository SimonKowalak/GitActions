package testCases77BugsStore;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects77BugsStore.HomePage;
import resources.base;

public class ValidateWomanMenuItem extends base {
	public WebDriver driver;

	@BeforeTest
	public void testSetup() throws IOException {
		driver = setup();
	}

	@Test
	public void ValidateWomanMMenuItem() {
		driver.get("http://www.77bugs.pl/shop/");
		HomePage homePage = new HomePage(driver);

		// get text of menu item and validate it
		String woman = homePage.getWomanText().getText();
		Assert.assertTrue(woman.equals("WOMAN"));
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
}
