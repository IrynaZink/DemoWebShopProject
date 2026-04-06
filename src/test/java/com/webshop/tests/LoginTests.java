package com.webshop.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    @Test
    public void loginPositiveTest(){
      //click on login link in header

        //int i = (int) ((System.currentTimeMillis()/1000)%3600);

        click(By.xpath("//a[@href='/login']"));

        //enter Email:
        type(By.xpath("//*[@id='Email']"), "irynazinkovych@gmail.com");
        //enter Password:
        type(By.xpath("//*[@id='Password']"), "Zink@12345");

        //click on login button
        click(By.cssSelector(".button-1.login-button"));


        //assert logout link is present
        Assert.assertTrue(isElementPresent(By.xpath("//a[@href='/logout']")));
    }
}
