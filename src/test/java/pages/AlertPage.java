package pages;

import objectData.AlertObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AlertPage extends BasePage{

    public AlertPage(WebDriver driver) {
        super(driver);
        pageMethods.validatePageTitle("Alerts");
    }

    @FindBy(css = ".nav-stacked>li>a")
    private List<WebElement> alertOptions;
    @FindBy(css = ".btn-danger")
    private WebElement clickAlertOkElement;
    @FindBy(css = ".btn-primary")
    private WebElement clickOkCancelElement;
    @FindBy(css = ".btn-info")
    private WebElement clickTextElement;

    public void dealAlertOk(){
        alertOptions.get(0).click();
        clickAlertOkElement.click();
        alertMethods.acceptAlert();
    }

    public void dealAlertOkCancel(){
        alertOptions.get(1).click();
        clickOkCancelElement.click();
        alertMethods.cancelAlert();
    }

    public void dealAlertText(AlertObject alertObject){
        alertOptions.get(2).click();
        clickTextElement.click();
        alertMethods.acceptFillAlert(alertObject.getAlertValue());
    }
}
