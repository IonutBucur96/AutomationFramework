package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IndexPage;
import pages.RegisterPage;

import java.util.List;

public class RegisterTest {

    //xpath este de 2 feluri: relativ si absolut
    //xpathul relativ porneste mereu cu //
    //xpathul absolut porneste mereu cu un /
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
        registerPage.registerValid("Ionut", "Bucur","Bucegi 13", "ionutbucur@yahoo.com","123456789","Java","Uclujnapoca","Uclujnapoca");


//        String expectedLanguage="Dutch";
//        String expectedLanguage2="Catalan";
//        List<WebElement> languageOptions = driver.findElements(By.cssSelector(".ui-menu>li>a"));
//        for (Integer index = 0; index<languageOptions.size();index++){
//            //trebuie sa iau textul de pe un element
//            String actualLanguage = languageOptions.get(index).getText();
//            if (actualLanguage.equals(expectedLanguage) || actualLanguage.equals(expectedLanguage2)){
//                languageOptions.get(index).click();
//            }
//        }

        WebElement skillsElement = driver.findElement(By.id("Skills"));
        Select skillsSelect = new Select(skillsElement);
        skillsSelect.selectByVisibleText("Java");

        WebElement yearElement = driver.findElement(By.id("yearbox"));
        Select yearSelect = new Select(yearElement);
        yearSelect.selectByValue("1996");

        WebElement monthElement = driver.findElement(By.cssSelector("select[placeholder='Month']"));
        Select monthSelect = new Select(monthElement);
        monthSelect.selectByVisibleText("January");

        WebElement selectCountryElement = driver.findElement(By.cssSelector(".select2-selection"));
        selectCountryElement.click();
        WebElement selectCountryInputElement = driver.findElement(By.className("select2-search__field"));
        selectCountryInputElement.sendKeys("India");
        selectCountryInputElement.sendKeys(Keys.ENTER);

    }
}
