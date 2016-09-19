package com.narayana.flyemirates.tests;

import org.testng.annotations.Test;

import com.narayana.flyemirates.pages.HomePage;

public class HomePageTest extends Base {

	@Test
	public void verifyPageTitle() {

		HomePage homePage = new HomePage(driver);
		homePage.verifyLanguageBasedonRegion();

	}

}
