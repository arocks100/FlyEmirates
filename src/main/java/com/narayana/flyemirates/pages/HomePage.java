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
	
	

	@FindBy(xpath=FlyEmiratesConstants.sLaunguage_xpath)
	private WebElement launguageSelector;
	
	@FindBy(xpath=FlyEmiratesConstants.sLanguageHeaderContent_xpath)
	private WebElement HeaderContent;
	
	@FindBy(xpath=FlyEmiratesConstants.countrySelectBox_xpath)
	private WebElement selectCountry;
	
	
	
	public void clickOnSelectLanguage() {

		launguageSelector.click();

	}
	
	public String headerContentText(){
		 String content=HeaderContent.getText();
		 return content;
	}
	
	
	

}
