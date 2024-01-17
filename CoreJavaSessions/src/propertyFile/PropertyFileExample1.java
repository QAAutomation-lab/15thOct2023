package propertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileExample1 {

	public static void main(String[] args) throws IOException {
		/*
		First find the location where you have stored property file
		Create an instance of FileInputStream class and pass the property file location to its constructor.
		Create an instance of Properties class
		With the help of properties reference variable call load() properties class and pass
     	FileInputStream class reference to this method
		Call getProperty(key) of Properties class to read data from property file
		 */
		
		/*
		 fileLocation:
		 	AbsoluteLocation: F:\JavaWorkspace\CoreJavaSessions\TestData\AppData.properties
		 	RelativeLocation: .\TestData\AppData.properties
		 			'.' indicates current working dir
		 			System.getProperty("user.dir");
		 */
		String fileLoc="F:\\JavaWorkspace\\CoreJavaSessions\\TestData\\AppData.properties";
		
		FileInputStream fis=new FileInputStream(fileLoc);
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("emailId"));
		System.out.println(prop.getProperty("mobileNum"));
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("Company"));
	}

}
