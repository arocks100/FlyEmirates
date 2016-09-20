package com.narayana.flyemirates.tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {

	Logger log=Logger.getLogger("Base");
	
	WebDriver driver;
	
	
	
	@BeforeTest
	public void init() {
		log.info("Initializing Driver");
		if (System.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.getProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
			log.info("Loaded Chrome Driver");
		}else if(System.getProperty("browser").equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
			log.info("Loaded Firefox Driver");
		}else{
			
			log.error("Initialize the driver properly");
		}
		
		driver.get("http://www.emirates.com/in/English/");

		log.info("Loaded URL");
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
		log.info("Driver Quit");
	}

}
