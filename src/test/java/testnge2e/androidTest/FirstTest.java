package testnge2e.androidTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.androidPage.MainPage;
import testnge2e.BaseTest;

public class FirstTest extends BaseTest {

    @Test
    public void firstTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertEquals(mainPage.getNameOfHeader(), "Notes");
    }
}
