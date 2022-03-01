package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public static AppiumDriver driver;

    public BasePage(AppiumDriver androidDriver) {
        driver = androidDriver;
        PageFactory.initElements(driver, this);
    }
}
