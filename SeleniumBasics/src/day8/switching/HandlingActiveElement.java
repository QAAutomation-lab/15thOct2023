package day8.switching;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.SeleniumUtil;
public class HandlingActiveElement {

	public static void main(String[] args) {
		WebDriver driver=SeleniumUtil.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		
		//get the active element from the screen
		WebElement element=driver.switchTo().activeElement();
		element.clear();
		String value=element.getAttribute("placeholder");
		String expectedValue="Username";
		System.out.println("is mouse pointer on username input field? "+value.equals(expectedValue));
		
		element.sendKeys("admin",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("admin",Keys.ENTER);
	}
}
/*
validate by default mouse pointer is blinking in username input field

login into Vtiger application without identifying any element
*/