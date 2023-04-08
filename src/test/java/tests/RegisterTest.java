package tests;

import objectData.RegisterObject;
import org.testng.annotations.Test;
import pages.IndexPage;
import pages.RegisterPage;
import sharedData.SharedData;

public class RegisterTest extends SharedData {

    //xpath este de 2 feluri: relativ si absolut
    //xpathul relativ porneste mereu cu //
    //xpathul absolut porneste mereu cu un /

    @Test
    public void metodaTest() {
        RegisterObject registerObject = new RegisterObject(getPropertiesUtility().getAllData());

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.registerValid(registerObject);
    }
}
