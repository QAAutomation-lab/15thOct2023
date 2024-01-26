package testscripts;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShoppingSite {
	static void login() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriverManager.chromedriver().browserVersion("120.0.6099.109").setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-popup-blocking"); // Disable popup blocking
		chromeOptions.addArguments("--start-maximized"); // Maximize the browser window
		chromeOptions.addArguments("--disable-extensions"); // Disable browser extensions

		// Set authentication credentials tester03@vomoto.com:Tester@1311
		chromeOptions.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
//		chromeOptions.addArguments("--user-data-dir=C:/Users/Asus/AppData/Local/Google/Chrome/User Data");
//		chromeOptions.addArguments("--profile-directory=Profile 8");
		chromeOptions.addArguments("--disable-extensions");	
		System.setProperty("webdriver.chrome.logfile", "./chromedriver.log");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.adidas.pt/");

	}
	static void loginLogout() throws MalformedURLException {
		//WebDriverManager.chromedriver().driverVersion("120.0.6099.109").setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:/Users/Asus/AppData/Local/Google/Chrome/User Data/");
		options.addArguments("--profile-directory=Profile 8");
		//options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");  
		options.addArguments("--no-sandbox"); // Bypass OS security model
		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		
		WebDriver driver = new ChromeDriver();
		
		// maximize browser window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// enter application URL
		driver.get("https://www.adidas.pt/");
		//https://tester03@vomoto.com:Tester@1311@www.adidas.pt
		//driver.get("https://tester03@vomoto.com:Tester@1311@www.adidas.pt");
		
		driver.findElement(By.xpath("//span[text()='Aceitar rastreio']")).click();
		
		driver.findElement(By.xpath("//a[@data-auto-id='customer-info-button']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
		
		driver.findElement(By.id("email")).sendKeys("tester03@vomoto.com",Keys.TAB);
		
		List<WebElement> checkboxs=driver.findElements(By.cssSelector("div[data-auto-id='explicit-consents']>span label"));
		
		for(int i=0;i<checkboxs.size();i++) {
			checkboxs.get(i).click();
		}
		
		driver.findElement(By.id("two-step-form-button")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
		
		driver.findElement(By.id("password")).sendKeys("Tester@1311");
		
		//driver.findElement(By.id("registration-submit-button")).click();
		
		driver.findElement(By.id("login-submit-button")).click();
		
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		
		//logout
		driver.findElement(By.xpath("//a[@data-auto-id='customer-info-button']")).click();
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		driver.findElement(By.id("ACCOUNT")).click();
		
		driver.findElement(By.xpath("//a[@data-auto-id='members-home-account-log-out']")).click();
	}
	public static void main(String[] args) throws MalformedURLException {
		
		login();
	//	loginLogout();
		
//		WebDriver driver = new ChromeDriver();
//		// maximize browser window
//		driver.manage().window().maximize();
//		// implicit wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		// enter application URL
//		driver.get("https://www.adidas.pt/");
//		
//		driver.findElement(By.xpath("//span[text()='Aceitar rastreio']")).click();
//		
//		Actions action=new Actions(driver);
//		
//		List<WebElement> menuItems=driver.findElements(By.xpath("//ul[@data-auto-id='main-menu']/li/a"));
//		
//		for(WebElement element:menuItems) {
//			if(element.getText().equals("COLEÇÕES")) {
//				action.moveToElement(element).perform();
//				driver.findElement(By.xpath("//div[text()='Ultraboost']")).click();
//			}
//		}
//		
//
//		
	}

}
