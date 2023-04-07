package tests;

import objectData.AlertObject;
import objectData.FrameObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertPage;
import pages.IndexPage;
import pages.RegisterPage;
import sharedData.SharedData;

public class AlertTest extends SharedData {


    @Test
    public void metodaTest() {
        AlertObject alertObject = new AlertObject(getPropertiesUtility().getAllData());

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.goToAlertPage();

        AlertPage alertPage = new AlertPage(getDriver());
        alertPage.dealAlertOk();
        alertPage.dealAlertOkCancel();
        alertPage.dealAlertText(alertObject);
    }
}
