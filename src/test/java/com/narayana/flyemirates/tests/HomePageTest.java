package com.narayana.flyemirates.tests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.narayana.flyemirates.pages.HomePage;
import com.narayana.flyemirates.utils.SeleniumCommands;

public class HomePageTest extends Base {

	
	Logger log=Logger.getLogger("HomePageTestHomePageTest");
	
	@Test
	public void verifyPageTitle() {

		HomePage homePage = new HomePage(driver);
		homePage.clickOnSelectLanguage();
		log.info("Clicked on Select Launguage Tab");
		SeleniumCommands.webDriverWait(driver,TimeUnit.SECONDS , 10);
		log.info("Wait for 10 seconds");
		String cont=homePage.headerContentText();
		System.out.println(cont);

	}

}
