package stepDefinitions;

import cucumberRunner.Runner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.androidPage.MainPage;

import static utils.DriverConnector.driver;

public class FirstTestOnAndroid extends Runner{

    private MainPage mainPage;

    @Given("The app is started")
    public void the_app_is_started() {
        mainPage = new MainPage(driver);
    }

    @Then("Header is {word}")
    public void header_is_notes(String expValue) {
        Assert.assertEquals(mainPage.getNameOfHeader(), expValue);
    }
}
