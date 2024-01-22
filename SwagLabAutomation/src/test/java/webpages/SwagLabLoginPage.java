package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class SwagLabLoginPage extends SeleniumUtility{
	
	public SwagLabLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-name")
	private WebElement usernameInputField;
	
	@FindBy(name="password")
	private WebElement passwordInputField;
	
	@FindBy(css=".submit-button")
	private WebElement loginButton;

	public WebElement getUsernameInputField() {
		return usernameInputField;
	}

	public WebElement getPasswordInputField() {
		return passwordInputField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void loginIntoApplication(String username,String password) {
		typeInput(usernameInputField, username);
		typeInput(passwordInputField, password);
		clickOnElement(loginButton);
	}
}
/*
	-->usernameInputField
	-->passwordInputField
	-->loginButton
*/