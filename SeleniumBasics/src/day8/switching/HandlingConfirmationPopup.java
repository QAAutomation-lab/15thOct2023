package day8.switching;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.SeleniumUtil;
public class HandlingConfirmationPopup {

	public static void main(String[] args) {
		WebDriver driver=SeleniumUtil.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
			
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		System.out.println("Confirmation msg: "+driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		//driver.switchTo().alert().dismiss();
	
	}
}
/*
TODO:
open browser and enter url https://jqueryui.com/
click on sortable
sort element from 7 to 1.
*/