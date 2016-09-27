package com.narayana.flyemirates.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {

	WebDriver driver;
	
	String leftCalMonth;
	int leftCalyear;
	
	String rightCalMonth;
	int rightCalyear;
	
	
	//int inputDate, String InputMonth, int inputYear
	public void calandar(int inputDate, String InputMonth, int inputYear){
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://fly10.emirates.com/CAB/IBE/SearchAvailability.aspx");
		
		driver.findElement(By.cssSelector("#txtarrivaldate")).click();
		
		List<WebElement> monthYear=driver.findElements(By.xpath("//span[starts-with(@id,'month')]"));
		String dateinLeftCal=monthYear.get(0).getText();
		String dateinRightCal=monthYear.get(1).getText();
		
		String[] my1=dateinLeftCal.split(" ");
		leftCalMonth=my1[0];
		leftCalyear=Integer.parseInt(my1[1]);
		
		String[] my2=dateinRightCal.split(" ");
		rightCalMonth=my2[0];
		rightCalyear=Integer.parseInt(my2[1]);
		
		System.out.println(leftCalMonth+leftCalyear);
		System.out.println(rightCalMonth+rightCalyear);
		
		if(InputMonth.equalsIgnoreCase(leftCalMonth)||InputMonth.equalsIgnoreCase(rightCalMonth)){
			if(inputYear==leftCalyear||inputYear==rightCalyear){
				List<WebElement> date1=driver.findElements(By.cssSelector("td[id^='day']"));
				for (int i = 0; i < date1.size(); i++) {
					String date=date1.get(i).getText();
					//if(date==inputDate)
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		
		Utils utils=new Utils();
	}

}
