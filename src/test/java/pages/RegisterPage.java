package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    public WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='SwitchTo']")
    public WebElement switchToElement;
    @FindBy(xpath = "//a[text()='Frames']")
    public WebElement frameElement;
    @FindBy(xpath = "//a[text()='Windows']")
    public WebElement windowsElement;
    @FindBy(xpath = "//a[text()='Alerts']")
    public WebElement alertsElement;
    @FindBy(css = "input[placeholder='First Name']")
    public WebElement firstName;
    @FindBy(css = "input[placeholder='Last Name']")
    public WebElement lastName;
    @FindBy(css = "textarea[ng-model='Adress']")
    public WebElement adress;
    @FindBy(css = "input[ng-model='EmailAdress']")
    public WebElement emailAdress;
    @FindBy(css = "input[type='tel']")
    public WebElement phoneNumber;
    @FindBy(xpath = "//input[@value='Male']")
    public WebElement maleGender;
    @FindBy(id = "checkbox1")
    public WebElement hobbyElement;
    @FindBy(id = "msdd")
    public WebElement languageElement;
    @FindBy(id = "Skills")
    public WebElement skillsElement;
    @FindBy(id = "yearbox")
    public WebElement yearElement;
    @FindBy(css = "select[placeholder='Month']")
    public WebElement monthElement;
    @FindBy (css = ".select2-selection")
    public WebElement selectCountryElement;
    @FindBy (className = "select2-search__field")
    public WebElement selectCountryInputElement;
    @FindBy(id = "firstpassword")
    public WebElement passwordElement;
    @FindBy(id = "secondpassword")
    public WebElement confirmPassword;
    @FindBy (id = "submitbtn")
    public WebElement submitElement;


    public void registerValid(String firstNameValue, String lastNameValue, String adressValue,String emailAdressValue,String phoneNumberValue,String skillValue, String passwordElementValue,String confirmPasswordValue){
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
