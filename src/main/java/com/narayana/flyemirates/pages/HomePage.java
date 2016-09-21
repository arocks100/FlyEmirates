package com.narayana.flyemirates.pages;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.narayana.flyemirates.utils.FlyEmiratesConstants;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = FlyEmiratesConstants.sLaunguage_xpath)
	private WebElement launguageSelector;

	@FindBy(xpath = FlyEmiratesConstants.sLanguageHeaderContent_xpath)
	private WebElement HeaderContent;

	@FindBy(xpath = FlyEmiratesConstants.sXdescription)
	private WebElement description;

	@FindBy(xpath = FlyEmiratesConstants.sAmericas)
	private WebElement continentAmerica;

	@FindBy(xpath = FlyEmiratesConstants.sXeurope)
	private WebElement continentEurope;

	@FindBy(xpath = FlyEmiratesConstants.sXMiddle_East)
	private WebElement contitentMiddleEast;

	@FindBy(xpath = FlyEmiratesConstants.sXAfrica)
	private WebElement contitentAfrica;

	@FindBy(xpath = FlyEmiratesConstants.sxAsia_South_Pacific)
	private WebElement contitentAsiaSouthPacific;

	@FindBys(value = { @FindBy(xpath = FlyEmiratesConstants.sxAllContinents) })
	private List<WebElement> allContinents;

	@FindBy(xpath = FlyEmiratesConstants.countrySelectBox_xpath)
	private WebElement selectCountry;

	@FindBy(xpath = FlyEmiratesConstants.sXLauSelectBox)
	private WebElement selectlanguage;

	@FindBy(xpath = FlyEmiratesConstants.xSGo)
	private WebElement go;

	public List<String> verifyContinents() {

		launguageSelector.click();

		List<String> al = new LinkedList<String>();
		for (int i = 0; i < allContinents.size(); i++)
			al.add(allContinents.get(i).getText());
		return al;
	}

}
