package com.narayana.flyemirates.tests;

import org.testng.annotations.Test;

import com.narayana.flyemirates.pages.NewHomePage;
import com.narayana.flyemirates.pages.SearchForFlightsPage;

public class TestSearchForFlights extends Base{

	
	@Test
	public void SearchforFlight(){
		
		NewHomePage newHomePage=new NewHomePage(driver);
		newHomePage.clickOnBook();
		SearchForFlightsPage searchForFlightsPage=newHomePage.clickOnBookSearchForFlights();
		searchForFlightsPage.clickonSearch();
	}
	
	
}
