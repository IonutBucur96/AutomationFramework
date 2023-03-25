package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FramePage;
import pages.IndexPage;
import pages.RegisterPage;
import sharedData.SharedData;

public class FrameTest extends SharedData {

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
        registerPage.goToFramePage();

        String expectedTitleFrames = "Frames";
        String actualTitleFrames = getDriver().getTitle();
        Assert.assertEquals(actualTitleFrames, expectedTitleFrames);

        FramePage framePage = new FramePage(getDriver());
        framePage.dealSingleFrame("Ionut");
        framePage.dealMultipleFrame("Bucur");
    }
}
