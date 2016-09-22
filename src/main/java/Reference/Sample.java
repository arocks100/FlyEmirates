package Reference;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.narayana.flyemirates.utils.FlyEmiratesConstants;

public class Sample {

	

	public static void main() {


		System.getProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://fly10.emirates.com/CAB/IBE/SearchAvailability.aspx");
		driver.findElement(By.xpath(FlyEmiratesConstants.HeaderTextMakeBooking_Xpath)).click();
		
	}
	
	public static void main(String[] args) {
		main();
	}
	
}
