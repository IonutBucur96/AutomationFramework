package tests;

import org.testng.annotations.Test;
import pages.IndexPage;
import pages.RegisterPage;
import sharedData.SharedData;

import java.util.Arrays;

public class RegisterTest extends SharedData {

    //xpath este de 2 feluri: relativ si absolut
    //xpathul relativ porneste mereu cu //
    //xpathul absolut porneste mereu cu un /

    @Test
    public void metodaTest() {
        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.registerValid("Ionut", "Bucur","Bucegi 13",
                "ionutbucur@yahoo.com","123456789","Java",
                "1996","January","Uclujnapoca","Uclujnapoca", Arrays.asList("Dutch","English"));
    }
}
