package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
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


    public void registerValid(String firstNameValue, String lastNameValue, String adressValue,String emailAdressValue,String phoneNumberValue,String skillValue,Integer yearValue,String monthValue, String passwordElementValue,String confirmPasswordValue){
        firstName.sendKeys(firstNameValue);
        lastName.sendKeys(lastNameValue);
        adress.sendKeys(adressValue);
        emailAdress.sendKeys(emailAdressValue);
        phoneNumber.sendKeys(phoneNumberValue);
        maleGender.click();
        hobbyElement.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,650)", "");
        languageElement.click();
        Select skillsSelect = new Select(skillsElement);
        skillsSelect.selectByVisibleText(skillValue);
        Select yearSelect = new Select(yearElement);
        yearSelect.selectByValue(String.valueOf(yearValue));
        Select monthSelect = new Select(monthElement);
        monthSelect.selectByVisibleText(monthValue);
        selectCountryElement.click();
        selectCountryInputElement.sendKeys("India");
        selectCountryInputElement.sendKeys(Keys.ENTER);
        passwordElement.sendKeys(passwordElementValue);
        confirmPassword.sendKeys(confirmPasswordValue);
        submitElement.click();

    }

    public void goToFramePage(){
        Actions actions = new Actions(driver);
        actions.moveToElement(switchToElement).perform();
        frameElement.click();
        driver.navigate().to("https://demo.automationtesting.in/Frames.html");
    }

    public void goToWindowPage(){
        Actions actions = new Actions(driver);
        actions.moveToElement(switchToElement).perform();
        windowsElement.click();
        driver.navigate().to("https://demo.automationtesting.in/Windows.html");
    }

    public void goToAlertPage(){
        Actions actions = new Actions(driver);
        actions.moveToElement(switchToElement).perform();
        alertsElement.click();
        driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
    }
}
