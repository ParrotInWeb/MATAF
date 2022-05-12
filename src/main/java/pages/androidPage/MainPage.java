package pages.androidPage;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class MainPage extends BasePage {

    private final By header = By.xpath("//android.view.ViewGroup[contains(@resource-id, 'toolbar')]/android.widget.TextView");

    public MainPage(AppiumDriver<WebElement> androidDriver) {
        super(androidDriver);
    }

    public String getNameOfHeader() {
        return driver.findElement(this.header).getText();
    }
}
