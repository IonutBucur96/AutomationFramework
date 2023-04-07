package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
        pageMethods.validatePageTitle("Register");
    }

    @FindBy(xpath = "//a[text()='SwitchTo']")
    private WebElement switchToElement;
    @FindBy(xpath = "//a[text()='Frames']")
    private WebElement frameElement;
    @FindBy(xpath = "//a[text()='Windows']")
    private WebElement windowsElement;
    @FindBy(xpath = "//a[text()='Alerts']")
    private WebElement alertsElement;
    @FindBy(css = "input[placeholder='First Name']")
    private WebElement firstName;
    @FindBy(css = "input[placeholder='Last Name']")
    private WebElement lastName;
    @FindBy(css = "textarea[ng-model='Adress']")
    private WebElement adress;
    @FindBy(css = "input[ng-model='EmailAdress']")
    private WebElement emailAdress;
    @FindBy(css = "input[type='tel']")
    private WebElement phoneNumber;
    @FindBy(xpath = "//input[@value='Male']")
    private WebElement maleGender;
    @FindBy(id = "checkbox1")
    private WebElement hobbyElement;
    @FindBy(id = "msdd")
    private WebElement languageElement;
    @FindBy(id = "Skills")
    private WebElement skillsElement;
    @FindBy(id = "yearbox")
    private WebElement yearElement;
    @FindBy(css = "select[placeholder='Month']")
    private WebElement monthElement;
    @FindBy (css = ".select2-selection")
    private WebElement selectCountryElement;
    @FindBy (className = "select2-search__field")
    private WebElement selectCountryInputElement;
    @FindBy(id = "firstpassword")
    private WebElement passwordElement;
    @FindBy(id = "secondpassword")
    private WebElement confirmPassword;
    @FindBy (id = "submitbtn")
    private WebElement submitElement;
    @FindBy(css = ".ui-menu>li>a")
    private List<WebElement> languageOptions;


    public void registerValid(String firstNameValue, String lastNameValue, String adressValue,
                              String emailAdressValue,String phoneNumberValue,String skillValue,String yearValue,
                              String monthValue, String passwordElementValue,String confirmPasswordValue, List<String> languageValues){
        firstName.sendKeys(firstNameValue);
        lastName.sendKeys(lastNameValue);
        adress.sendKeys(adressValue);
        emailAdress.sendKeys(emailAdressValue);
        phoneNumber.sendKeys(phoneNumberValue);
        maleGender.click();
        hobbyElement.click();

        pageMethods.scrollPage(0,650);

        languageElement.click();
        selectLanguage(languageValues);

        elementMethods.selectElementByText(skillsElement, skillValue);
        elementMethods.selectElementByValue(yearElement, yearValue);
        elementMethods.selectElementByText(monthElement, monthValue);

        selectCountryElement.click();
        selectCountryInputElement.sendKeys("India");
        selectCountryInputElement.sendKeys(Keys.ENTER);
        passwordElement.sendKeys(passwordElementValue);
        confirmPassword.sendKeys(confirmPasswordValue);
        submitElement.click();
    }

    public void selectLanguage(List<String> languages){
        for (Integer index = 0; index<languageOptions.size();index++){
            //trebuie sa iau textul de pe un element
            String actualLanguage = languageOptions.get(index).getText();
            if (languages.contains(actualLanguage)){
                languageOptions.get(index).click();
            }
        }
    }

    public void goToFramePage(){
        elementMethods.moveToElement(switchToElement);
        frameElement.click();
        pageMethods.navigateToUrl("https://demo.automationtesting.in/Frames.html");
    }

    public void goToWindowPage(){
        elementMethods.moveToElement(switchToElement);
        windowsElement.click();
        pageMethods.navigateToUrl("https://demo.automationtesting.in/Windows.html");
    }

    public void goToAlertPage(){
        elementMethods.moveToElement(switchToElement);
        alertsElement.click();
        pageMethods.navigateToUrl("https://demo.automationtesting.in/Alerts.html");
    }
}
