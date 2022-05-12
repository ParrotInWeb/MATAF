package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public static AppiumDriver<WebElement> driver;

    public BasePage(AppiumDriver<WebElement> androidDriver) {
        driver = androidDriver;
        PageFactory.initElements(driver, this);
    }
}
