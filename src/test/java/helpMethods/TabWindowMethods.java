package helpMethods;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class TabWindowMethods {

    private WebDriver driver;

    public TabWindowMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void switchTabWindowByIndex(Integer index){
        List<String> tabList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabList.get(index));
        System.out.println(driver.getTitle());
    }

    public void closeCurrentTabWindow(){
        driver.close();
    }
}
