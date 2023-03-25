package tests;

import org.testng.annotations.Test;
import pages.IndexPage;
import pages.SignInPage;
import sharedData.SharedData;

public class LoginTest extends SharedData {

    @Test
    public void metodaTest(){
        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSignIn();

        SignInPage signInPage = new SignInPage(getDriver());
        signInPage.loginInvalid("ionut.bucur@test.com","Parola123","Invalid User Name or PassWord");
    }


}
