package Reference;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	

	public static HashMap<Integer, String> main() {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		System.getProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.emirates.com/english/");
		driver.findElement(By.xpath("//a[@data-ek-id='select-language-menu']")).click();
		driver.findElement(By.xpath("//a[@class='reg-north-south-america select-region-link']")).click();
		Select select = new Select(driver.findElement(By.xpath("//select[@id='select-region-dropdown']")));
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			// System.out.println(options.get(i).getText());
			hm.put(i, options.get(i).getText());
		}
		
		for(Entry<Integer, String> m:hm.entrySet())
			System.out.println(m.getKey()+" --> "+m.getValue());
		return hm;
	}
	
	public static void main(String[] args) {
		main();
	}
	
}
