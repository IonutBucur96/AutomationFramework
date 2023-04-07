package helpMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PageMethods {

    private WebDriver driver;

    public PageMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void validatePageTitle(String expected){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expected);
    }

    public void navigateToUrl(String url){
        driver.navigate().to(url);
    }

    public void scrollPage(Integer x, Integer y){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+x+","+y+")", "");
    }

}
