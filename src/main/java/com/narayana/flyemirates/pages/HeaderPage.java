package com.narayana.flyemirates.pages;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.narayana.flyemirates.utils.FlyEmiratesConstants;
import com.narayana.flyemirates.utils.SeleniumCommands;

public class HeaderPage {

	WebDriver driver;

	public HeaderPage(WebDriver driver) {

		this.driver = driver;
	}

	Logger log = Logger.getLogger("HeaderPage");

	@FindBy(css = FlyEmiratesConstants.Header.selectLan_Css)
	private WebElement changeLaunguage;

	@FindBy(css = FlyEmiratesConstants.Header.help_Css)
	private WebElement help;

	@FindBy(css = FlyEmiratesConstants.Header.search_css)
	private WebElement search;

	/**
	 * Clicks on ChangeLaunguag in Header Bar and waits for 10 Sec
	 */
	public void clikOnChangeLaunguage() {

		changeLaunguage.click();
		SeleniumCommands.webDriverWait(driver, 10l, TimeUnit.SECONDS);
	}

	/**
	 * Clicks on Help in Header Bar and waits for 10 Sec
	 */
	public void clikOnHelp() {

		help.click();
		SeleniumCommands.webDriverWait(driver, 10l, TimeUnit.SECONDS);
	}

	/**
	 * Clicks on Search in Header Bar and waits for 10 Sec
	 */
	public void clikOnSearch() {

		search.click();
		SeleniumCommands.webDriverWait(driver, 10l, TimeUnit.SECONDS);
	}

}
