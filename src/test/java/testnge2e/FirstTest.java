package testnge2e;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class FirstTest extends BaseTest {

    @Test
    public void firstTest() {
        MainPage mainPage = new MainPage(androidDriver);
        Assert.assertEquals(mainPage.getNameOfHeader(), "Notes");
    }
}
