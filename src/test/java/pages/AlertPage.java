package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AlertPage {

    public WebDriver driver;

    public AlertPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".nav-stacked>li>a")
    public List<WebElement> alertOptions;
    @FindBy(css = ".btn-danger")
    public WebElement clickAlertOkElement;
    @FindBy(css = ".btn-primary")
    public WebElement clickOkCancelElement;
    @FindBy(css = ".btn-info")
    public WebElement clickTextElement;

    public void dealAlertOk(){
        alertOptions.get(0).click();
        clickAlertOkElement.click();
        Alert alertOk = driver.switchTo().alert();
        alertOk.accept();
    }

    public void dealAlertOkCancel(){
        alertOptions.get(1).click();
        clickOkCancelElement.click();
        Alert alertOkCancel = driver.switchTo().alert();
        alertOkCancel.dismiss();
    }

    public void dealAlertText(String alertValue){
        alertOptions.get(2).click();
        clickTextElement.click();
        Alert alertText = driver.switchTo().alert();
        alertText.sendKeys(alertValue);
        alertText.accept();
    }
}
