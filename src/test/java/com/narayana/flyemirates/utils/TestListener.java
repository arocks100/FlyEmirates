package com.narayana.flyemirates.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.narayana.flyemirates.tests.Base;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestListener implements ITestListener {
	
	
	ExtentReports reports;
	ExtentTest logger;

	public void onTestStart(ITestResult result) {
		
		reports=new ExtentReports((System.getProperty("user.dir")+"\\Reports")+result.getName()+".html", true);
		logger.log(LogStatus.INFO, "");
	}

	public void onTestSuccess(ITestResult result) {
		
		logger.log(LogStatus.PASS, result.getName());
	}

	public void onTestFailure(ITestResult result) {
		
		String path=(System.getProperty("user.dir")+"\\Reports\\ScreenShots")+result.getName()+".jpg";
		Base base=new Base();
		File scrFile = ((TakesScreenshot)base.driver).getScreenshotAs(OutputType.FILE);
           try {
			FileUtils.copyFile(scrFile, new File(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           logger.log(LogStatus.FAIL, path, "@@@@");
	}

	public void onTestSkipped(ITestResult result) {
		
		logger.log(LogStatus.SKIP, result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
		reports.endTest(logger);
		reports.flush();
	}

	
}
