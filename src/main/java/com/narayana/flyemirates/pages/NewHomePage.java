package com.narayana.flyemirates.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.narayana.flyemirates.utils.FlyEmiratesConstants;

public class NewHomePage {

	Logger log=Logger.getLogger("NewHomePage");
	
	WebDriver driver;

	public NewHomePage(WebDriver driver) {
		this.driver = driver;
		log.info("Initialized the Elements of -->NewHomePage Class<--");
	}

	@FindBy(xpath = FlyEmiratesConstants.sMenuBar_Book_Xpath)
	private WebElement book;

	@FindBy(xpath = FlyEmiratesConstants.sMenuBar_Book_Xpath)
	private WebElement searchForFlights;
	
	

	/**
	 * Clicks on Book Button on MenuBar
	 */

	public void clickOnBook() {

		// Click on Book
		book.click();
		log.info("Clicked on --->Book from Header Menu<---");
	}
	
	/**
	 * Search Flights from Book HomePage
	 * 
	 * @return SearchForFlightsPage
	 */

	public SearchForFlightsPage clickOnBookSearchForFlights() {

		// Click on Search for Flights
		searchForFlights.click();
		log.info("Clicked on --->Search Flights<---");
		
		// Returns Search for Flights Page
		log.info("Initialized  --->SearchForFlightsPage WEbElements<---");
		return PageFactory.initElements(driver, SearchForFlightsPage.class);
		
	}
	
	
	public void clickonBookaHotel(){
		
		
		
	}

	public void clickOnManage() {

	}

	public void clickOnExperience() {

	}

	public void clickOnDestinations() {

	}

}
