package com.webshop.tests;

import com.webshop.core.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    @Test
    public void loginPositiveTest(){
      //click on login link in header

        //int i = (int) ((System.currentTimeMillis()/1000)%3600);

        app.getUser().click(By.xpath("//a[@href='/login']"));

        //enter Email:
        app.getUser().type(By.xpath("//*[@id='Email']"), "irynazinkovych@gmail.com");
        //enter Password:
        app.getUser().type(By.xpath("//*[@id='Password']"), "Zink@12345");

        //click on login button
        app.getUser().click(By.cssSelector(".button-1.login-button"));


        //assert logout link is present
        Assert.assertTrue(app.getUser().isElementPresent(By.xpath("//a[@href='/logout']")));
    }
}
