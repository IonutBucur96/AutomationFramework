package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {

    public WebDriver driver;

    public IndexPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "btn1")
    public WebElement signInElement;
    @FindBy(id = "btn2")
    public WebElement skipSignIn;

    public void clickSignIn(){
        signInElement.click();
    }

    public void clickSkipSignIn(){
        skipSignIn.click();
    }
}
