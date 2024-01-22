package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class SwagLabHomePage extends SeleniumUtility{
	
	public SwagLabHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="react-burger-menu-btn")
	private WebElement navigationPannel;
	
	@FindBy(linkText="Logout")
	private WebElement logoutLink;

	public WebElement getNavigationPannel() {
		return navigationPannel;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	public void logoutFromApplication() {
		clickOnElement(navigationPannel);
		clickOnElement(logoutLink);
	}
}
/*
	-->navigationPannel
	-->logoutLink

*/