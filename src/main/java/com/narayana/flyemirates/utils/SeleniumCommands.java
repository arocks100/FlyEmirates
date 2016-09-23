package com.narayana.flyemirates.utils;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SeleniumCommands {

	public static Logger log = Logger.getLogger("SeleniumCommands");

	public static void webDriverWait(WebDriver driver,  long l,TimeUnit unit) {

		driver.manage().timeouts().implicitlyWait(l, unit);
		log.info("Webdriver Wait");

	}

	public static void selectBox(WebElement element, String selectByVisibleText) {

		Select select = new Select(element);
		select.deselectByVisibleText(selectByVisibleText);
	}

}
