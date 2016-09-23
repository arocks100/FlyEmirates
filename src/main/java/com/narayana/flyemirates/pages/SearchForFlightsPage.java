package com.narayana.flyemirates.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class SearchForFlightsPage {

	Logger log = Logger.getLogger("SearchForFlightsPage");

	WebDriver driver;

	public SearchForFlightsPage(WebDriver driver) {
		this.driver = driver;
		log.info("Executed Constructor of <--SearchForFlightsPage-->");
	}

	
}
