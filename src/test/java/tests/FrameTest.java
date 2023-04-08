package tests;

import objectData.FrameObject;
import org.testng.annotations.Test;
import pages.FramePage;
import pages.IndexPage;
import pages.RegisterPage;
import sharedData.SharedData;

public class FrameTest extends SharedData {

    @Test
    public void metodaTest() {
        FrameObject frameObject = new FrameObject(getPropertiesUtility().getAllData());

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.goToFramePage();

        FramePage framePage = new FramePage(getDriver());
        framePage.dealSingleFrame(frameObject);
        framePage.dealMultipleFrame(frameObject);
    }
}
