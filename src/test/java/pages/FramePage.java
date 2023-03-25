package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FramePage {

    public WebDriver driver;

    public FramePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".nav-tabs>li>a")
    public List<WebElement> frameOptions;
    @FindBy(css = "input[type='text']")
    public WebElement inputSingleFrame;
    @FindBy(css = "input[type='text']")
    public WebElement inputMultipleFrame;

    public void dealSingleFrame(String singleValue){
        frameOptions.get(0).click();
        driver.switchTo().frame("singleframe");
        inputSingleFrame.sendKeys(singleValue);
        driver.switchTo().defaultContent();
    }

    public void dealMultipleFrame(String multipleValue){
        frameOptions.get(1).click();
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']")));
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']")));
        inputMultipleFrame.sendKeys(multipleValue);
    }
}
