package com.narayana.flyemirates.pages;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.narayana.flyemirates.utils.FlyEmiratesConstants;
import com.narayana.flyemirates.utils.SeleniumCommands;

public class MenuPage {

	WebDriver driver;

	public MenuPage(WebDriver driver) {

		this.driver = driver;
	}

	Logger log = Logger.getLogger("MenuPage");

	@FindBy(css = FlyEmiratesConstants.Menu.book_css)
	private WebElement book;

	@FindBy(css = FlyEmiratesConstants.Menu.manage_css)
	private WebElement manage;

	@FindBy(css = FlyEmiratesConstants.Menu.experience_css)
	private WebElement experience;

	@FindBy(css = FlyEmiratesConstants.Menu.destinations_css)
	private WebElement destinations;

	@FindBy(css = FlyEmiratesConstants.Menu.destinations_css)
	private WebElement emiratesSkywads_BussRewards;

	/**
	 * Clicks on Book in Menu Bar and waits for 10 Sec
	 */
	public void clickOnBook() {

		book.click();
		log.info("------>Clicked on Book<----");
		SeleniumCommands.webDriverWait(driver, 10l, TimeUnit.SECONDS);
	}

	/**
	 * Clicks on Manage in Menu Bar and waits for 10 Sec
	 */
	public void clickonManage() {

		manage.click();
		log.info("------>Clicked on mange<----");
		SeleniumCommands.webDriverWait(driver, 10l, TimeUnit.SECONDS);
	}

	/**
	 * Clicks on Experience in Menu Bar and waits for 10 Sec
	 */
	public void clickonExperience() {

		experience.click();
		log.info("------>Clicked on Experience<----");
		SeleniumCommands.webDriverWait(driver, 10l, TimeUnit.SECONDS);
	}

	/**
	 * Clicks on Experience in Menu Bar and waits for 10 Sec
	 */
	public void clickonDestinations() {

		destinations.click();
		log.info("------>Clicked on Destinations<----");
		SeleniumCommands.webDriverWait(driver, 10l, TimeUnit.SECONDS);
	}

	/**
	 * Clicks on EmiratesSkywads_BussRewards in Menu Bar and waits for 10 Sec
	 */
	public void clickonRewards() {

		emiratesSkywads_BussRewards.click();
		log.info("------>Clicked on EmiratesSkywads_BussRewards<----");
		SeleniumCommands.webDriverWait(driver, 10l, TimeUnit.SECONDS);
	}

}
