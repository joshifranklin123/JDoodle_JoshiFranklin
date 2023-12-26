package com.baseclass;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;
	
	
	public  void browser_Launch() throws Exception {
		
		FileInputStream file = new FileInputStream("src/test/resources/Properties/JDoodle.properties");
		
		Properties prep = new Properties();
		
		prep.load(file);
		
		prep.getProperty("Browser").equalsIgnoreCase("chrome");
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		
		driver.get(prep.getProperty("Application_Url"));
		

	}
	
	public void browser_Close() {
		driver.quit();
	}
	

}
