package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IndexPage;
import pages.SignInPage;

public class LoginTest {
    public WebDriver driver;

    @Test
    public void metodaTest(){
        //ca sa fixez eroarea Internal server 403
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        //trebuie sa setam driverul de chrome
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        //deschidem un browser
        driver=new ChromeDriver(chromeOptions);
        //accesam un URL
        driver.get("https://demo.automationtesting.in/Index.html");
        driver.manage().window().maximize();

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSignIn();

        SignInPage signInPage = new SignInPage(driver);
        signInPage.loginInvalid("ionut.bucur@test.com","Parola123","Invalid User Name or PassWord");
    }

    //adaug validari de pagina pentru restul testelor


}
