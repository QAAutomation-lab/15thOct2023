package stepdefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.SeleniumUtility;

public class OrangeHRMWithHooksSetpDef extends SeleniumUtility{
//	
//	//Hooks
//	@Before
//	public void starUp() {
//		setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	}
//	
//	@Given("^user in on OrangeHRML login page and enters username as (.+) in the username field$")
//	public void user_in_on_orangehrml_login_page_and_enters_username_as_in_the_username_field(String username) {
//		typeInput(driver.findElement(By.name("username")),username);
//	}
//
//	@Then("^dashboard page URL should contains (.+) on OrangeHRML Dashboard$")
//	public void dashboard_page_url_should_contains_on_orangehrml_dashboard(String endurl) {
//		Assert.assertTrue(getCurrentUrlOfApplication().contains(endurl));
//	}
//
//	@And("^user enters password as (.+) in OrangeHRML password field$")
//	public void user_enters_password_as_in_orangehrml_password_field(String password) {
//		typeInput(driver.findElement(By.name("password")),password);
//	}
//
//	@And("^clicks on Login button of OrangeHRML$")
//	public void clicks_on_login_button_of_orangehrml() {
//		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
//	}
//	
//	@After
//	public void finish() {
//		cleanUp();
//	}
}
