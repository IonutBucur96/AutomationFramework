package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SignInPage {

    public WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[placeholder='E mail']")
    public WebElement emailElement;
    @FindBy(css = "input[placeholder='Password']")
    public WebElement passwordElement;
    @FindBy(id = "enterbtn")
    public WebElement enterElement;
    @FindBy(id = "errormsg")
    public WebElement errorElement;

    public void loginInvalid(String emailValue, String passwordValue, String expectedError){
        emailElement.sendKeys(emailValue);
        passwordElement.sendKeys(passwordValue);
        enterElement.click();
        String actualError = errorElement.getText();
        Assert.assertEquals(actualError, expectedError);
    }
}
