package sharedData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import propertiesFile.PropertiesUtility;

public class SharedData {

    private WebDriver driver;
    private PropertiesUtility propertiesUtility;


    @BeforeMethod
    public void setupEnvironment(){
        propertiesUtility = new PropertiesUtility();
        //trebuie sa setam driverul de chrome
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        //declaram un obiect de tipul ChromeOptions care ne ajuta sa adaugam niste proprietati pe chrome
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--remote-allow-origins");
        //deschidem un browser
        driver = new ChromeDriver();
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

    public PropertiesUtility getPropertiesUtility() {
        return propertiesUtility;
    }
}
