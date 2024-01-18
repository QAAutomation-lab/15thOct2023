package day8.switching;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.SeleniumUtil;
public class HandlingAlerts {

	public static void main(String[] args) {
		WebDriver driver=SeleniumUtil.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
			
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		System.out.println("Alert msg: "+driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
	
	}
}
/*
TODO:
open browser and enter url https://jqueryui.com/
click on sortable
sort element from 7 to 1.
*/