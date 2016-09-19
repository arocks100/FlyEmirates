package com.narayana.flyemirates.tests;

import org.testng.annotations.Test;

public class Config {

	public static String browser;

	@Test
	public void setEnvVariables() {

		browser = System.getProperty("browser");
	}

}
