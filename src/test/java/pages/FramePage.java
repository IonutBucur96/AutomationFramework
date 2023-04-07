package pages;

import objectData.FrameObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FramePage extends BasePage {

    public FramePage (WebDriver driver) {
        super(driver);
        pageMethods.validatePageTitle("Frames");
    }

    @FindBy(css = ".nav-tabs>li>a")
    private List<WebElement> frameOptions;
    @FindBy(css = "input[type='text']")
    private WebElement inputSingleFrame;
    @FindBy(css = "input[type='text']")
    private WebElement inputMultipleFrame;


    public void dealSingleFrame(FrameObject frameObject){
        frameOptions.get(0).click();
        frameMethods.switchToFrame("singleframe");
        inputSingleFrame.sendKeys(frameObject.getSingleFrame());
        frameMethods.switchDefault();
    }

    public void dealMultipleFrame(FrameObject frameObject){
        frameOptions.get(1).click();
        frameMethods.switchToFrame(driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']")));
        frameMethods.switchToFrame(driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']")));
        inputMultipleFrame.sendKeys(frameObject.getMultipleFrame());
    }
}
