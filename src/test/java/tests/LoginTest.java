package tests;

import objectData.LoginObject;
import org.testng.annotations.Test;
import pages.IndexPage;
import pages.SignInPage;
import sharedData.SharedData;

public class LoginTest extends SharedData {

    @Test
    public void metodaTest(){

        LoginObject loginObject = new LoginObject(getPropertiesUtility().getAllData());

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSignIn();

        SignInPage signInPage = new SignInPage(getDriver());
        signInPage.loginInvalid(loginObject);
    }
}
