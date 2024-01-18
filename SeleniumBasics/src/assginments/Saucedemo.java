package assginments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.SeleniumUtil;

public class Saucedemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=SeleniumUtil.setUp("chrome", "https://www.saucedemo.com/");		
		
		String userNames=driver.findElement(By.id("login_credentials")).getText();
		
		System.out.println("User names: "+userNames);
		
		String[] userList=userNames.split("\n");
		System.out.println("User at index 1: "+userList[1]);
		driver.findElement(By.id("user-name")).sendKeys(userList[1]);
	}

}
