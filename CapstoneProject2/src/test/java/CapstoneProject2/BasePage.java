package CapstoneProject2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	
	protected WebDriver driver;
	
	protected WebDriverWait wait;
	
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
}
