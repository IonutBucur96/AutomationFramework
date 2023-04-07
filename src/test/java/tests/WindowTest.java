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
        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.goToWindowPage();

        WindowPage windowPage = new WindowPage(getDriver());
        windowPage.dealSingleTab();
        windowPage.dealSingleWindow();
        windowPage.dealMultipleTabs();
    }
}
