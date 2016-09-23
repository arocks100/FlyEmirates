package com.narayana.flyemirates.pages;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.narayana.flyemirates.utils.FlyEmiratesConstants;
import com.narayana.flyemirates.utils.SeleniumCommands;

public class NewHomePage {

	Logger log = Logger.getLogger("NewHomePage");

	WebDriver driver;

	public NewHomePage(WebDriver driver) {
		this.driver = driver;
		log.info("Initialized the Elements of -->NewHomePage Class<--");
	}

	@FindBy(xpath = FlyEmiratesConstants.HomePage.homePage_MenuBookx)
	private WebElement book;

	@FindBy(id = FlyEmiratesConstants.HomePage.homePage_MenusubSearchFlightsid)
	private WebElement searchForFlights;

	/**
	 * Clicks on Book Button on MenuBar
	 */

	public void moveToBook() {

		// Click on Book
		Actions action = new Actions(driver);
		action.moveToElement(book).build().perform();
		SeleniumCommands.webDriverWait(driver, 10, TimeUnit.SECONDS);
		log.info("Moved to --->Book from Header Menu<---");
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

	public void clickonBookaHotel() {

	}

	public void clickOnManage() {

	}

	public void clickOnExperience() {

	}

	public void clickOnDestinations() {

	}

}
