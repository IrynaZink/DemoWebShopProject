package come.phonebook.core;

import come.phonebook.fw.ItemHelper;
import come.phonebook.fw.UserHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class ApplicationManager   {


    String browser;
    public WebDriver driver;
    UserHelper user;
    ItemHelper item;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        user = new UserHelper(driver);
        item = new ItemHelper(driver);

    }
    public void stop() {
        driver.quit();
    }

    public UserHelper getUser() {
        return user;
    }

    public ItemHelper getItem() {
        return item;
    }


}
