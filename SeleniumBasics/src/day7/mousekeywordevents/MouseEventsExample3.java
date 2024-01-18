package day7.mousekeywordevents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.SeleniumUtil;

public class MouseEventsExample3 {

	public static void main(String[] args) {
		WebDriver driver=SeleniumUtil.setUp("chrome", "https://jqueryui.com/droppable/");
		//switching control to frame
		driver.switchTo().frame(0);
		
		Actions action=new Actions(driver);
		
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement dest=driver.findElement(By.id("droppable"));
		
		action.dragAndDrop(src, dest).build().perform();
	}
}
/**
login into Actitime without clicking on Login button

*/