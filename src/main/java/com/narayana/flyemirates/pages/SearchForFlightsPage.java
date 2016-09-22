package com.narayana.flyemirates.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.narayana.flyemirates.utils.FlyEmiratesConstants;

public class SearchForFlightsPage {

	Logger log = Logger.getLogger("SearchForFlightsPage");

	WebDriver driver;

	public SearchForFlightsPage(WebDriver driver) {
		this.driver = driver;
		log.info("Executed Constructor of <--SearchForFlightsPage-->");
	}

	@FindBy(xpath = FlyEmiratesConstants.HeaderTextMakeBooking_Xpath)
	private WebElement loginButton;
	
	@FindBy(xpath = FlyEmiratesConstants.Search_Xpath)
	private WebElement search;

	
	public String getUrl(){
		log.info("Getting Current");
		return driver.getCurrentUrl();
	}
	
	
	public LoginPage clickOnLogin() {

	// Click on Login Button
		loginButton.click();
	log.info("Clicked on Login Button");	
	
	log.info("pageFactory Initialized --->LoginPage WEbElements<---");
		return PageFactory.initElements(driver, LoginPage.class);
	}
	
	public void clickonSearch(){
		
		search.click();
		log.info("Clicked on Search Button");
	}

}
