package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertPage;
import pages.IndexPage;
import pages.RegisterPage;

import java.util.List;

public class AlertTest {

    public WebDriver driver;

    @Test
    public void metodaTest() {
        //trebuie sa setam driverul de chrome
        System.setProperty("webdriver.edge.driver", "src/test/resources/msedgedriver.exe");
//        //declaram un obiect de tipul ChromeOptions care ne ajuta sa adaugam niste proprietati pe chrome
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--remote-allow-origins");
        //deschidem un browser
        driver = new EdgeDriver();
        //accesam un URL
        driver.get("https://demo.automationtesting.in/Index.html");
        //facem browser sa fie maximised
        driver.manage().window().maximize();

        String expectedTitleIndex = "Index";
        String actualTitleIndex = driver.getTitle();
        Assert.assertEquals(actualTitleIndex, expectedTitleIndex);

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSkipSignIn();

        String expectedTitleRegister = "Register";
        String actualTitleRegister = driver.getTitle();
        Assert.assertEquals(actualTitleRegister, expectedTitleRegister);

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.goToAlertPage();

        String expectedTitleAlerts = "Alerts";
        String actualTitleAlerts = driver.getTitle();
        Assert.assertEquals(actualTitleAlerts, expectedTitleAlerts);

        AlertPage alertPage = new AlertPage(driver);
        alertPage.dealAlertOk();
        alertPage.dealAlertOkCancel();
        alertPage.dealAlertText("Ionut");
    }
}
