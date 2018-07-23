package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.FirstSeleniumTest;


public class PropertiesFile {
	
	static Properties prop = new Properties();
		
	public static void readPropertiesFile() {
		
		
		try {
			
			InputStream input = new FileInputStream("/Users/macbook/eclipse-workspace/FirstSelenium/src/config/config.properties");
			prop.load(input);
			FirstSeleniumTest.browser = prop.getProperty("browser"); 
			System.out.println(FirstSeleniumTest.browser);
		
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public static void writePropertiesFile() {
		
		try {
			
			OutputStream output = new FileOutputStream("/Users/macbook/eclipse-workspace/FirstSelenium/src/config/config.properties");
			prop.setProperty("result", "pass");
			prop.store(output, null);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
