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
        this.waitIdleOnPageForSecond(1);
        element.sendKeys(keys);
        return this;
    }

    private void waitIdleOnPageForSecond(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            System.out.println("Unable to wait on the page.");
        }
    }

    public String pageTitle() {
        return webDriver.findElement(By.id("firstHeading")).getText();
    }

    public void quiteDriver() {
        webDriver.quit();
    }
}
