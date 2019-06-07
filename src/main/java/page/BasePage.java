package page;

import config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    private WebDriver webDriver;
    private WebElement element;

    public BasePage() {
        webDriver = WebDriverConfig.getDriver();
    }

    public void url(String url) {
        webDriver.navigate().to(url);
    }

    public BasePage getElement(By byElement) {
        element = webDriver.findElement(byElement);
        return this;
    }

    public BasePage searchTextOnElement(String searchText) {
        element.sendKeys(searchText);
        return this;
    }

    public BasePage sendKeyToElement(Keys keys) {
        element.sendKeys(keys);
        return this;
    }

    public String pageTitle() {
        return webDriver.findElement(By.id("firstHeading")).getText();
    }

    public void quiteDriver() {
        webDriver.quit();
    }
}
