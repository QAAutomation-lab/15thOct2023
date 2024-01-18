package day7.mousekeywordevents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utility.SeleniumUtil;

public class KeyboardEventsExample2 {

	public static void main(String[] args) {
		WebDriver driver=SeleniumUtil.setUp("chrome", "https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']"))
						.sendKeys("Pune",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Keys.TAB);
	}

}
/**
login into Actitime without clicking on Login button

*/