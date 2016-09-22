package com.narayana.flyemirates.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.narayana.flyemirates.utils.FlyEmiratesConstants;

public class BookAHotelPage {

	WebDriver driver;

	public BookAHotelPage(WebDriver driver) {
		this.driver = driver;

	}
	
	@FindBy(xpath=FlyEmiratesConstants.BookHotelButton_Xpath)
	private WebElement findHotels;

}
