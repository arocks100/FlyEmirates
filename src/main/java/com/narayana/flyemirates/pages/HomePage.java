package com.narayana.flyemirates.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.narayana.flyemirates.utils.FlyEmiratesConstants;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = FlyEmiratesConstants.sLaunguage_id)
	private WebElement launguageSelector;

	public void verifyLanguageBasedonRegion() {

		launguageSelector.click();

	}

}
