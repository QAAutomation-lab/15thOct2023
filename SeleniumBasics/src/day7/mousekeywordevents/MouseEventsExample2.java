package day7.mousekeywordevents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.SeleniumUtil;

public class MouseEventsExample2 {

	public static void main(String[] args) {
		WebDriver driver=SeleniumUtil.setUp("chrome", "https://demo.automationtesting.in/Register.html");
		
		Actions action=new Actions(driver);
		
		List<WebElement> menuList=driver.findElements(By.cssSelector(".navbar-nav>li>a"));
		
		System.out.println("Menu count: "+menuList.size());
		
		for(int i=0;i<menuList.size();i++) {
			System.out.println("Menu item number "+i+": "+menuList.get(i).getText());
			action.moveToElement(menuList.get(i)).perform();
		}
	}
}
/**
login into Actitime without clicking on Login button

*/