package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class WindowPage extends BasePage{

    public WindowPage(WebDriver driver) {
        super(driver);
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
        System.out.println(driver.getTitle());
        List<String> tabList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabList.get(1));
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(tabList.get(0));
    }

    public void dealSingleWindow(){
        tabWindowOptions.get(1).click();
        clickWindow.click();
        List<String> windowList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowList.get(1));
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(windowList.get(0));
    }

    public void dealMultipleTabs(){
        tabWindowOptions.get(2).click();
        clickMultiple.click();
        List<String> multipleList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(multipleList.get(2));
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(multipleList.get(1));
        driver.close();
        driver.switchTo().window(multipleList.get(0));
    }
}
