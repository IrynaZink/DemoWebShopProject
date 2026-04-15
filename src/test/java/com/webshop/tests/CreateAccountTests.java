package com.webshop.tests;

import com.webshop.core.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    // создаем позитивный тест с регистрацией нового пользователя
    @Test
    public void registerNewUserPositiveTest(){

        int i = (int) ((System.currentTimeMillis()/1000)%3600);
        app.getUser().click(By.xpath("//a[@href='/register']"));
        app.getUser().type(By.xpath("//*[@id='FirstName']"), "Ivan");
        app.getUser().type(By.xpath("//*[@id='LastName']"), "Ivanov");
        app.getUser().type(By.xpath("//*[@id='Email']"), "ivanivanov406" + i + "@gmail.com");
        app.getUser().type(By.xpath("//*[@id='Password']"), "Ivanov@12345");

        app.getUser().type(By.xpath("//*[@id='ConfirmPassword']"), "Ivanov@12345");

        app.getUser().click(By.xpath("//*[@id='register-button']"));

        Assert.assertTrue(app.getUser().isElementPresent(By.xpath("//a[@href='/logout']")));
    }


}
