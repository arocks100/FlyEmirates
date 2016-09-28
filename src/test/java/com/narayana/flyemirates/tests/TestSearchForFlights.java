package com.narayana.flyemirates.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.narayana.flyemirates.pages.NewHomePage;
import com.narayana.flyemirates.pages.SearchForFlightsPage;
import com.narayana.flyemirates.utils.ErrorCollector;
import com.narayana.flyemirates.utils.SeleniumCommands;

public class TestSearchForFlights extends Base{

	
	@Test
	public void SearchforFlight() throws InterruptedException {
		
		NewHomePage newHomePage=PageFactory.initElements(driver, NewHomePage.class);
		newHomePage.moveToBook();
		SeleniumCommands.webDriverWait(driver, 10, TimeUnit.SECONDS);
		SearchForFlightsPage searchForFlightsPage=newHomePage.clickOnBookSearchForFlights();
		ErrorCollector.verifyEquals(driver.getCurrentUrl(), "http://fly10.emirates.com/CAB/IBE/SearchAvailability.aspx");
	}
	
	
}
