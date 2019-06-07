package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConfig {

    private WebDriver webDriver;

    private WebDriverConfig() {}

    private static WebDriverConfig getDriverConfig() {
        WebDriverConfig webDriverConfig = new WebDriverConfig();
        webDriverConfig.setProperties();
        webDriverConfig.initialiseDriver();
        return webDriverConfig;
    }

    private void setProperties() {
        System.setProperty("webdriver.chrome.driver","chromedriver");
    }

    private void initialiseDriver() {
        webDriver = new ChromeDriver();
    }

    public static WebDriver getDriver() {
        return getDriverConfig().webDriver;
    }

}
