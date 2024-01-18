package day7.mousekeywordevents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.SeleniumUtil;

public class MouseEventsExample4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=SeleniumUtil.setUp("chrome", "https://jqueryui.com/draggable/");
		//switching control to frame
		driver.switchTo().frame(0);
		
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		WebElement src=driver.findElement(By.id("draggable"));
		action.dragAndDropBy(src, 200, 50).build().perform();
	}
}
/**
login into Actitime without clicking on Login button

*/