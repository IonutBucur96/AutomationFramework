package pages;

import objectData.LoginObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    public SignInPage(WebDriver driver) {
        super(driver);
        pageMethods.validatePageTitle("SignIn");
    }

    private WebDriver driver;



    @FindBy(css = "input[placeholder='E mail']")
    private WebElement emailElement;
    @FindBy(css = "input[placeholder='Password']")
    private WebElement passwordElement;
    @FindBy(id = "enterbtn")
    private WebElement enterElement;
    @FindBy(id = "errormsg")
    private WebElement errorElement;


    public void loginInvalid(LoginObject loginObject){
        elementMethods.fillElement(emailElement, loginObject.getLoginEmail());
        elementMethods.fillElement(passwordElement, loginObject.getLoginPassword());
        elementMethods.clickElement(enterElement);
        elementMethods.validateElementText(errorElement, loginObject.getLoginErrorMessage());
    }
}
