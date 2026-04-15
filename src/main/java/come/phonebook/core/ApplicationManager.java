package come.phonebook.core;

import come.phonebook.fw.ItemHelper;
import come.phonebook.fw.UserHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationManager   {


    protected WebDriver driver;
    UserHelper user;
    ItemHelper item;
    //HomePageHelper homepage;




    public void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        user = new UserHelper(driver);
        item = new ItemHelper(driver);
        //homepage = new HomePageHelper(driver);

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

    //public HomePageHelper getHomepage() {
        //return homepage;
    //}
    //Создайте, пожалуйста, в домашнем проекте структуру Value Object Model
    //
    //Создайте методы init() и stop()
    //Создайте класс ApplicationManager
    //Переместите из TestBase Webdriver и все методы, кроме setUp() и tearDown()
    //Создайте классы родительский BaseHelper, его наследники UserHelper, ItemHelper и другие, если это необходимо
    //Переместите из ApplicationManager универсальные методы в BaseHelper, адресные в те хелперы, к которым они имеют отношение
    //В ApplicationManager объявите и инициализируйте UserHelper, ItemHelper и другие, кроме BaseHelper, создайте для них геттеры
    //В хэлперах создайте конструкторы
    //Почините тестовые методы, подтянув геттеры
    //Создайте структуру Value Object Model в виде папок в main(core, fw), в test(core, tests)
    //Проверьте работоспособность проекта, запустив весь пакет


}
