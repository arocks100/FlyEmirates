package com.narayana.flyemirates.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {

	WebDriver driver;
	
	public void calandar(){
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://fly10.emirates.com/CAB/IBE/SearchAvailability.aspx");
		driver.findElement(By.cssSelector("#txtarrivaldate")).click();
		List<WebElement> monthYear=driver.findElements(By.xpath("//span[starts-with(@id,'month')]"));
		String date1=monthYear.get(0).getText();
		String date2=monthYear.get(1).getText();
		String[] s=date1.split(" ");
		for (int i = 0; i < s.length; i++) {
			System.out.println("@@@@@"+s[i]);
		}
		System.out.println(date2);
	}
	
	
	
	public static void main(String[] args) {
		
		
		Utils utils=new Utils();
		utils.calandar();
	}

}
