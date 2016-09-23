package com.narayana.flyemirates.utils;

public interface FlyEmiratesConstants {

	public interface HomePage {

		// --------------------Top-Header Launguage, Help and
		// Search-----------------

		// Launguage
		String homePage_HeaderSelectLanguageX = "//a[@class='menu-item menu-item-with-button']";
		String homePage_HeaderSelectLanguageHeaderTextX = "//h2[@class='heading nocufon']";
		String homePage_HeaderSelectLanguageDescrpTextX = "//p[@class='introduction']";

		// Continents
		String homePage_HeaderContinentTheAmericasx = "//a[@class='reg-north-south-america select-region-link']";
		String homePage_HeaderContinentEuropex = "//a[@class='reg-europe select-region-link']";
		String homePage_HeaderContinentTheMiddleEastx = "//a[@class='reg-middle-east select-region-link']";
		String homePage_HeaderContinentTheAfricax = "//a[@class='reg-africa select-region-link']";
		String homePage_HeaderContinentAsia_SouthPacificx = "//a[@class='reg-asia-south-pacific select-region-link']";

		// All Continents
		String homePage_HeaderContinentAllContinentsx = "//select[@id='select-region-dropdown']/preceding::div[@class='title']";

		// Contry SelectBox
		String homePage_HeaderContinentCountrySelectBoxx = "//select[@id='select-region-dropdown']";
		String homePage_HeaderContinentLaunguageSelectBoxx = "//select[@id='select-language-dropdown']";

		// Go
		String homePage_HeaderContinentGox = "//a[@class='btn btn-default btn-custom btn-lang-selector']";

		// --------------------------MENU-----------------------------------------------
		// Book
		String homePage_MenuBookx = "//li[@id='book']";
		String homePage_MenusubSearchFlightsid = "Search for flights-link-label";

		// Manage
		String homePage_MenuManageid = "trips";

		// Experience
		String homePage_MenuExperincex = "//li[@id='inFlight']";

		// Destinations
		String homePage_MenuDestinationsx = "//li[@id='destinations']";

		// Emirates Skywords and Business Rewards

		String homePage_MenuSkywordsBusinessRewardsx = "//li[@class='account membership-br-member-only hidden-xs hidden-sm clickable']";
	}

	public interface SearchforFlightPage {
		//Login Button
		String LoginButtonx="//a[@id='ctl00_c_skywardsLoginbtn']";
		
		//Make Booking
		
		//Radio button-"rB"
		String rBreturnid="ctl00_c_CtWNW_ltReturn";
		String rBoneWayid="ctl00_c_CtWNW_ltOneway";
		String rBadvSearchid="ctl00_c_CtWNW_ltMultiDes";
		
        //TextBox---"tBAjax"---------calander----**----Cal-
		String tBAjDepAirportid="ctl00_c_CtWNW_ddlFrom-suggest";
		String calDepDepartid="txtDepartDate";
		String selectClassx="//*[@id='ctl00_c_CtWNW_flightClass_chosen']/a";
		String tBArrAirportid="ctl00_c_CtWNW_ddlTo-suggest";
		String calreturntid="txtarrivaldate";
		String returnselectClassx="//*[@id='ctl00_c_CtWNW_flightClass1_chosen']/a";
		
		
		//Passengers
		String selectAdultsx="//*[@id='ctl00_c_CtNoOfTr_numberAdults_chosen']/a";
		String selectChildx="//*[@id='ctl00_c_CtNoOfTr_numberChildren_chosen']/a";
		String selectInfantsx="//*[@id='ctl00_c_CtNoOfTr_numberinfants_chosen']/a";
		
		//Promotional Offers
		String promoCodex="//input[@id='ctl00_c_CtPrOffer_txtEnterCode']";
		
		//Search
		String searchx="//a[@id='ctl00_c_IBE_PB_FF']";
	}

}
