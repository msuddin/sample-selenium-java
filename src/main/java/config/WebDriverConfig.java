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
        String osName = System.getProperty("os.name");
        String chromeDriverType;

        if (osName.toLowerCase().contains("windows")) {
            chromeDriverType = "chromedriver.exe";
        } else {
            chromeDriverType = "chromedriver";
        }
        System.setProperty("webdriver.chrome.driver", chromeDriverType);
    }

    private void initialiseDriver() {
        webDriver = new ChromeDriver();
    }

    public static WebDriver getDriver() {
        return getDriverConfig().webDriver;
    }

}
