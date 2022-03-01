package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class MainPage extends BasePage {

    private final By header = By.xpath("//android.view.ViewGroup[contains(@resource-id, 'toolbar')]/android.widget.TextView");

    public MainPage(AppiumDriver driver) {
        super(driver);
    }

    public String getNameOfHeader() {
        return driver.findElement(this.header).getText();
    }
}
