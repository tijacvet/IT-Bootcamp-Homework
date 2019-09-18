package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemonautHome {
	public static final String URL="http://newtours.demoaut.com/";
	private static final String REGISTER_BUTTON_XPATH="//a[contains(text(),'REGISTER')]";
	//private static final By REGISTER_BUTTON_LOCATOR=By.xpath("//a[contains(text(),'REGISTER')]");
	
	public static WebElement getRegisterButton(WebDriver driver) {
		return driver.findElement(By.xpath(REGISTER_BUTTON_XPATH));
	}
	public static void clickRegisterButton(WebDriver driver) {
		getRegisterButton(driver).click();
	}
	
}
