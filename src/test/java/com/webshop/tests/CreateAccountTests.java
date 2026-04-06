package com.webshop.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    // создаем позитивный тест с регистрацией нового пользователя
    @Test
    public void registerNewUserPositiveTest(){
        //click on Register link in header

        int i = (int) ((System.currentTimeMillis()/1000)%3600);

        click(By.xpath("//a[@href='/register']"));

        //enter gender

        //enter First name
        type(By.xpath("//*[@id='FirstName']"), "Ivan");

        //enter Last name:
        type(By.xpath("//*[@id='LastName']"), "Ivanov");

        //enter Email:
        type(By.xpath("//*[@id='Email']"), "ivanivanov406" + i + "@gmail.com");

        //enter Password:
        type(By.xpath("//*[@id='Password']"), "Ivanov@12345");

        //enter Confirm password:
        type(By.xpath("//*[@id='ConfirmPassword']"), "Ivanov@12345");

        //click on register button
        click(By.xpath("//*[@id='register-button']"));


        //assert logout link is present
        Assert.assertTrue(isElementPresent(By.xpath("//a[@href='/logout']")));
    }


}
