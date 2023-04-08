package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WindowPage extends BasePage{

    public WindowPage(WebDriver driver) {
        super(driver);
        pageMethods.validatePageTitle("Frames & windows");
    }

    private WebDriver driver;


    @FindBy(css = ".nav-stacked>li>a")
    private List<WebElement> tabWindowOptions;
    @FindBy(css = "#Tabbed>a>button")
    private WebElement clickTab;
    @FindBy(css = "#Seperate>button")
    private WebElement clickWindow;
    @FindBy(css = "#Multiple>button")
    private WebElement clickMultiple;



    public void dealSingleTab(){
        tabWindowOptions.get(0).click();
        clickTab.click();
        tabWindowMethods.switchTabWindowByIndex(1);
        tabWindowMethods.closeCurrentTabWindow();
        tabWindowMethods.switchTabWindowByIndex(0);
    }

    public void dealSingleWindow(){
        tabWindowOptions.get(1).click();
        clickWindow.click();
        tabWindowMethods.switchTabWindowByIndex(1);
        tabWindowMethods.closeCurrentTabWindow();
        tabWindowMethods.switchTabWindowByIndex(0);
    }

    public void dealMultipleTabs(){
        tabWindowOptions.get(2).click();
        clickMultiple.click();
        tabWindowMethods.switchTabWindowByIndex(2);
        tabWindowMethods.closeCurrentTabWindow();
        tabWindowMethods.switchTabWindowByIndex(1);
        tabWindowMethods.closeCurrentTabWindow();
        tabWindowMethods.switchTabWindowByIndex(0);
    }
}
