package com.narayana.flyemirates.utils;

public interface FlyEmiratesConstants {
	
	/**
	 * Landing Page
	 */
	
	
	//Select launguage
	String sLaunguage_xpath="//a[@class='menu-item menu-item-with-button']";
	
	// header and description
	String sLanguageHeaderContent_xpath="//h2[@class='heading nocufon']";
	String sXdescription="//p[@class='introduction']";
	
	//Continents
	
	String sAmericas="//a[@class='reg-north-south-america select-region-link']";
	String sXeurope="//a[@class='reg-europe select-region-link']";
	String sXMiddle_East="//a[@class='reg-middle-east select-region-link']";
	String sXAfrica="//a[@class='reg-africa select-region-link']";
	String sxAsia_South_Pacific="//a[@class='reg-asia-south-pacific select-region-link']";
	
	String sxAllContinents="//select[@id='select-region-dropdown']/preceding::div[@class='title']";
	
	//SelectBox Country
	String countrySelectBox_xpath="//select[@id='select-region-dropdown']";
	
	//SelectBox Launguage
	String sXLauSelectBox="//select[@id='select-language-dropdown']";
	
	//Go
	String xSGo="//a[@class='btn btn-default btn-custom btn-lang-selector']";
	
	/*
	 * Menu Bar
	 */
	
	//Book
	String sMenuBar_Book_Xpath="//li[@id='book']";
	
	//Search for Flights
	
	String sSub_MenuBar_Book_Xpath="//li[@id='book']/following::a[@class='btn btn-primary']";
	
	
	//Manage
	String sMenuBar_Manage_Xpath="//li[@id='book']";
	
	//Experience
	String sMenuBar_Experience_Xpath="//li[@id='inFlight']";
	
	//Destinations
	String sMenuBar_Destinations_Xpath="//li[@id='destinations']";
	
	//Emirates Skywords and Business Rewards
	
	String sMenuBar_SkywordsBusinessRewards_Xpath="//li[@class='account membership-br-member-only hidden-xs hidden-sm clickable']";
	
	
	
	/**
	 * Search for Flight Page
	 */

	String HeaderTextMakeBooking_Xpath="//a[@id='ctl00_c_skywardsLoginbtn']";
	
	String Search_Xpath=".//*[@id='ctl00_c_IBE_PB_FF']";
	
	
	/**
	 * 
	 * Book Hotel
	 * 
	 */
	
	String BookHotelButton_Xpath="//span[@class='form-btn secondBtn homeWidget']";
	
}
