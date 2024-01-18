package day0.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
//		//Step1: set driver executable path
//		System.setProperty("webdriver.chrome.driver","F:\\JavaWorkspace\\SeleniumBasics\\drivers\\chromedriver.exe");
//		//step2: create instance of required browser class
//		ChromeDriver cdriver=new ChromeDriver();
		
				//or
//		ChromeDriver cdriver=new ChromeDriver();
		
		//Step1: set driver executable path
//		System.setProperty("webdriver.gecko.driver","F:\\JavaWorkspace\\SeleniumBasics\\drivers\\geckodriver.exe");
//		//step2: create instance of required browser class
//		FirefoxDriver cdriver=new FirefoxDriver();
		
			//or
//		FirefoxDriver fdriver=new FirefoxDriver();	
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String pageSource=driver.getPageSource();
		//System.out.println("source code: "+pageSource);
		System.out.println("Source code lenght: "+pageSource.length());
		
		driver.close();
	}
}
