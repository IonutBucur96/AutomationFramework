package helpMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ElementMethods {

    private WebDriver driver;

    public ElementMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElement(WebElement element){
        element.click();
    }

    public void fillElement(WebElement element, String value){
        element.sendKeys(value);
    }

    public void validateElementText(WebElement element, String expected){
        String actualText = element.getText();
        Assert.assertEquals(actualText, expected);
    }

    public void moveToElement(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public void selectElementByText(WebElement element, String value){
        Select elementSelelct = new Select(element);
        elementSelelct.selectByVisibleText(value);
    }

    public void selectElementByValue(WebElement element, String value){
        Select elementSelelct = new Select(element);
        elementSelelct.selectByValue(value);
    }
}
