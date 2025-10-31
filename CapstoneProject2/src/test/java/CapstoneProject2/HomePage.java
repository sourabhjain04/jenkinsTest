package CapstoneProject2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    By firstProduct = By.cssSelector(".inventory_item:first-of-type .btn_inventory");
    By cartIcon = By.className("shopping_cart_link");
    By menuBtn = By.id("react-burger-menu-btn");
    By logoutLink = By.id("logout_sidebar_link");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void addFirstProductToCart() {
        driver.findElement(firstProduct).click();
    }

    public void goToCart() {
        driver.findElement(cartIcon).click();
    }

    public void logout() {
        driver.findElement(menuBtn).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement logoutElement = wait.until(
            ExpectedConditions.elementToBeClickable(logoutLink)
        );

        // Scroll into view (just in case)
        ((org.openqa.selenium.JavascriptExecutor) driver)
            .executeScript("arguments[0].scrollIntoView(true);", logoutElement);

        logoutElement.click();
    }
}
