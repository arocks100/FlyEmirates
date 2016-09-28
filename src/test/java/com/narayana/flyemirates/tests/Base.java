package com.narayana.flyemirates.tests;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.narayana.flyemirates.utils.ErrorCollector;

public class Base {

	Logger log=Logger.getLogger("Base");
	
	public WebDriver driver;
	
	
	
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
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
		log.info("Driver Quit");
		List<Throwable> results=ErrorCollector.getResults();
		Iterator<Throwable> it=results.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
