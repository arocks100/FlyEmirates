package com.narayana.flyemirates.tests;

import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.narayana.flyemirates.pages.HomePage;
import com.narayana.flyemirates.utils.Assertions;

public class HomePageTest extends Base {

	Logger log = Logger.getLogger("HomePageTest");

	@Test
	public void testCase() {
		log.info("Executing @@Test");
		HomePage homePage = new HomePage(driver);
		List<String> expected = homePage.verifyContinents();
		List<String> actual=new LinkedList<String>();
		
		actual.add("The Americas");
		actual.add("Europe");
		actual.add("The Middle East");
		actual.add("Africa");
		actual.add("Asia & South Pacific");
		boolean result=Assertions.isListEmpty(actual, expected);
		Assert.assertTrue(result);
	}

}
