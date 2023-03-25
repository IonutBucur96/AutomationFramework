package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertPage;
import pages.IndexPage;
import pages.RegisterPage;
import sharedData.SharedData;

public class AlertTest extends SharedData {


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
        registerPage.goToAlertPage();

        String expectedTitleAlerts = "Alerts";
        String actualTitleAlerts = getDriver().getTitle();
        Assert.assertEquals(actualTitleAlerts, expectedTitleAlerts);

        AlertPage alertPage = new AlertPage(getDriver());
        alertPage.dealAlertOk();
        alertPage.dealAlertOkCancel();
        alertPage.dealAlertText("Ionut");
    }
}
