package sharedData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SharedData {

    private WebDriver driver;

    @BeforeMethod
    public void setupEnvironment(){
        //trebuie sa setam driverul de chrome
        System.setProperty("webdriver.edge.driver", "src/test/resources/msedgedriver.exe");
//        //declaram un obiect de tipul ChromeOptions care ne ajuta sa adaugam niste proprietati pe chrome
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--remote-allow-origins");
        //deschidem un browser
        driver = new EdgeDriver();
        //accesam un URL
        driver.get("https://demo.automationtesting.in/Index.html");
        //facem browser sa fie maximised
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void clearEnvironment(){
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
