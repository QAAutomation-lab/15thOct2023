package testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
import webpages.SwagLabHomePage;
import webpages.SwagLabLoginPage;

public class SwagLabLoginValidation extends SeleniumUtility{
	
	SwagLabLoginPage getSwagLabLoginPage;
	SwagLabHomePage getSwagLabHomePage;

	@BeforeTest
	public void precondition() {
		driver=setUp("chrome", "https://www.saucedemo.com/");
		getSwagLabLoginPage=new SwagLabLoginPage(driver);
		getSwagLabHomePage=new SwagLabHomePage(driver);
	}
	
	@Test
	public void testLoginLogout() {
		getSwagLabLoginPage.loginIntoApplication("standard_user", "secret_sauce");
		getSwagLabHomePage.logoutFromApplication();
		String expectedUrl="https://www.saucedemo.com/";
		String actrualUrl=getCurrentUrlOfApplication();
		Assert.assertEquals(actrualUrl, expectedUrl,"Either logout failed or page url changed");
	}
	
	@AfterTest
	public void tearDown() {
		cleanUp();
	}
}
