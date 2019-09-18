package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DemonautRegister {
	public static final String URL="http://newtours.demoaut.com/mercuryregister.php";
	private static final String TXTNAME_XPATH = "//input[@name='firstName']";
	private static final String SELECT_COUNTRY_XPATH="//select[@name='country']";
	
	public static WebElement getTxtName(WebDriver driver) {
		return driver.findElement(By.xpath(TXTNAME_XPATH));
	}

	public static void clickTxtName(WebDriver driver) {
		getTxtName(driver).click();
	}
	public static void inputTxtName(WebDriver driver,String data) {
		getTxtName(driver).sendKeys(data);
	}
	
	public static Select getCountry(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(SELECT_COUNTRY_XPATH)));
	}

	public static void inputCountry(WebDriver driver,String data) {
		getCountry(driver).selectByVisibleText(data);
	}
	
	
}
