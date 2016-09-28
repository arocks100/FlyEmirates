package Reference;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	WebDriver driver;

	String leftCalMonth;
	int leftCalyear;

	String rightCalMonth;
	int rightCalyear;

	public void cal(String month, int date, int year) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://fly10.emirates.com/CAB/IBE/SearchAvailability.aspx");

		driver.findElement(By.cssSelector("#txtarrivaldate")).click();

		String leftCal = driver.findElement(By.cssSelector("span#monthLeft")).getText();
		String[] leftDM=leftCal.split(" ");
		leftCalMonth=leftDM[0];
		leftCalyear=Integer.parseInt(leftDM[1]);
		if(month==leftCalMonth ||year==leftCalyear){
			WebElement we=driver.findElement(By.cssSelector("#calendarLeft"));
			List<WebElement> datee=we.findElements(By.cssSelector("td[id^='day-']>a"));
			for (int i = 0; i < datee.size(); i++) {
				int datefromSite=Integer.parseInt(datee.get(i).getText());
				if(date==datefromSite)
					datee.get(i).click();
			}
		}
		
	}
	
	public static void path(){
		System.out.println((System.getProperty("user.dir")+"\\Reports\\ScreenShots"));
	}

	public static void main(String[] args) {

		path();
	}

}
