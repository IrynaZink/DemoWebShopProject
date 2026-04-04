package com.webshop.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{
    // создаем позитивный тест с регистрацией нового пользователя
    @Test
    public void registerNewUserPositiveTest(){
        //click on Register link in header

        driver.findElement(By.xpath("//a[@href='/register']")).click();

        //enter gender

        //enter First name
        driver.findElement(By.xpath("//*[@id='FirstName']")).click();
        driver.findElement(By.xpath("//*[@id='FirstName']")).clear();
        driver.findElement(By.xpath("//*[@id='FirstName']")).sendKeys("Ivan");

        //enter Last name:
        driver.findElement(By.xpath("//*[@id='LastName']")).click();
        driver.findElement(By.xpath("//*[@id='LastName']")).clear();
        driver.findElement(By.xpath("//*[@id='LastName']")).sendKeys("Ivanov");

        //enter Email:
        driver.findElement(By.xpath("//*[@id='Email']")).click();
        driver.findElement(By.xpath("//*[@id='Email']")).clear();
        driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("ivanivanov405@gmail.com");

        //enter Password:
        driver.findElement(By.xpath("//*[@id='Password']")).click();
        driver.findElement(By.xpath("//*[@id='Password']")).clear();
        driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("Ivanov@12345");

        //enter Confirm password:
        driver.findElement(By.xpath("//*[@id='ConfirmPassword']")).click();
        driver.findElement(By.xpath("//*[@id='ConfirmPassword']")).clear();
        driver.findElement(By.xpath("//*[@id='ConfirmPassword']")).sendKeys("Ivanov@12345");

        //click on register button
        driver.findElement(By.xpath("//*[@id='register-button']")).click();


        //assert logout link is present
        Assert.assertTrue(isElementPresent(By.xpath("//a[@href='/logout']")));






    }

}
