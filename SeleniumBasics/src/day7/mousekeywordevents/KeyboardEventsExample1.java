package day7.mousekeywordevents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utility.SeleniumUtil;

public class KeyboardEventsExample1 {

	public static void main(String[] args) {
		WebDriver driver=SeleniumUtil.setUp("chrome", "https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
	}

}
/**
login into Actitime without clicking on Login button

*/