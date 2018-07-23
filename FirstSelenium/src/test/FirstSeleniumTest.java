package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.PropertiesFile;

public class FirstSeleniumTest {
	public static String browser;
	static WebDriver driver;
	
	public static void main(String[] args) {
		//setBrowser();
		PropertiesFile.readPropertiesFile();
		setBrowserConfig();
		runTest();
		PropertiesFile.writePropertiesFile();
		
	}
	/**
	 * Description: set the browser to run
	 * @author Truc
	 * @date 22 Jul
	 */
	public static void setBrowser() {
		browser = "Firefox";
	}
	public static void setBrowserConfig() {
		
		String projectLocation = System.getProperty("user.dir");
		
		//This condition block sets config for Firefox
		if(browser.contains("Firefox")) {
		System.setProperty("webdriver.gecko.driver", projectLocation + "/lib/geckodriver/geckodriver");
		driver = new FirefoxDriver();
		}
		
		if(browser.contains("Chrome")) {
		System.setProperty("webdriver.chrome.driver", projectLocation + "/lib/chromedriver/chromedriver");
		driver = new ChromeDriver();
		}
	}
	public static void runTest() {

		driver.get("http://seleniumhq.org/");
		driver.quit();
	}
}
