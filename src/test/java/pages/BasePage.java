package pages;

import helpMethods.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver driver;
    public AlertMethods alertMethods;
    public FrameMethods frameMethods;
    public TabWindowMethods tabWindowMethods;
    public ElementMethods elementMethods;
    public PageMethods pageMethods;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        alertMethods = new AlertMethods(driver);
        frameMethods = new FrameMethods(driver);
        tabWindowMethods = new TabWindowMethods(driver);
        elementMethods = new ElementMethods(driver);
        pageMethods = new PageMethods(driver);
    }
}
