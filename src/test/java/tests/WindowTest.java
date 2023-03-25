package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IndexPage;
import pages.RegisterPage;
import pages.WindowPage;
import sharedData.SharedData;

public class WindowTest extends SharedData {


    @Test
    public void metodaTest() {
        String expectedTitleIndex = "Index";
        String actualTitleIndex = getDriver().getTitle();
        Assert.assertEquals(actualTitleIndex, expectedTitleIndex);

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSignIn();

        String expectedTitleRegister = "Register";
        String actualTitleRegister = getDriver().getTitle();
        Assert.assertEquals(actualTitleRegister, expectedTitleRegister);

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.goToWindowPage();

        String expectedTitleWindows = "Frames & windows";
        String actualTitleWindows = getDriver().getTitle();
        Assert.assertEquals(actualTitleWindows, expectedTitleWindows);

        WindowPage windowPage = new WindowPage(getDriver());
        windowPage.dealSingleTab();
        windowPage.dealSingleWindow();
        windowPage.dealMultipleTabs();
    }
}
