package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.DemonautHome;
import page.objects.DemonautRegister;

public class DemonautTestRegister {
	public static boolean testRegister() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(DemonautHome.URL);
		DemonautHome.clickRegisterButton(driver);
		if(driver.getCurrentUrl().contains(DemonautRegister.URL)==false) {
			return false;
		}
		
		DemonautRegister.inputCountry(driver, "SERBIA");
		return true;
	}
}
