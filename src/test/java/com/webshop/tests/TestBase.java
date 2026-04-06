package com.webshop.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestBase {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @Test
    public void isElementRegisterPresentTest(){
        //System.out.println("Register is " + isElementRegisterPresent());
        Assert.assertTrue(isElementRegisterPresent());

    }
    public  boolean isElementRegisterPresent(){
        return driver.findElements(By.xpath("//*[@href='/register']")).size()>0;
    }
    public boolean isElementPresent(By locator){
        return driver.findElements(locator).size()>0;
    }


    @AfterMethod(enabled = false)
    public void tearDown(){
        driver.quit();
    }


    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }
}
