package day0.openbrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdirver.gecko.driver", ".\\drivers\\geckodriver.exe");
		
		FirefoxDriver fdriver=new FirefoxDriver();
	}

}
