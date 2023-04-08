package pages;

import objectData.RegisterObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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


    public void registerValid(RegisterObject registerObject){
        firstName.sendKeys(registerObject.getFirstNameValue());
        lastName.sendKeys(registerObject.getLastNameValue());
        adress.sendKeys(registerObject.getAddressValue());
        emailAdress.sendKeys(registerObject.getEmailValue());
        phoneNumber.sendKeys(registerObject.getPhoneValue());
        maleGender.click();
        hobbyElement.click();

        pageMethods.scrollPage(0,650);

        languageElement.click();
        selectLanguage(registerObject.getLanguageValues());

        elementMethods.selectElementByText(skillsElement, registerObject.getSkillValue());
        elementMethods.selectElementByValue(yearElement, registerObject.getYearValue());
        elementMethods.selectElementByText(monthElement, registerObject.getMonthValue());

        selectCountryElement.click();
        selectCountryInputElement.sendKeys("India");
        selectCountryInputElement.sendKeys(Keys.ENTER);
        passwordElement.sendKeys(registerObject.getPasswordValue());
        confirmPassword.sendKeys(registerObject.getConfirmPasswordValue());
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
