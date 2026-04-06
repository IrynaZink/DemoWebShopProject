package com.webshop.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ItemTests extends TestBase{
    //В домашнем проекте сделайте, пожалуйста, рефакторинг тестового класса CreateAccountTests
    //Создайте класс ItemTests и в нем метод addItemToCartTest() с предусловием,
    // где вы авторизуетесь(login)
    // Шаги в методе addItemToCartTest(): кликнуть на кнопку второго товара Add to cart;
    // кликнуть на ссылку Shopping cart в хэдере; проверить добавление товара в корзину по его названию(имени)

    //precondition with login
    @BeforeMethod
    public void precondition(){
        click(By.xpath("//a[@href='/login']"));
        //enter Email:
        type(By.xpath("//*[@id='Email']"), "irynazinkovych@gmail.com");
        //enter Password:
        type(By.xpath("//*[@id='Password']"), "Zink@12345");
        //click on login button
        click(By.cssSelector(".button-1.login-button"));
         }
    @Test
    public void addItemToCartTest(){
        // кликаем на второй товар //*[@class='item-box'][2]//input[@value='Add to cart']
       click(By.xpath("//*[@class='item-box'][2]//input[@value='Add to cart']"));
       click(By.xpath("(//span[normalize-space()='Shopping cart'])[1]"));
       Assert.assertTrue(isNameOfItemIsAdded("14.1-inch Laptop"));

                //driver.findElement(By.xpath("//*[@class='item-box'][2]//input[@value='Add to cart']"));
    }

    public boolean isNameOfItemIsAdded(String text) {
        List<WebElement> items = driver.findElements(By.xpath("//*[text()='14.1-inch Laptop']"));
        for (WebElement element: items){
            if(element.getText().contains(text))
                return true;
        }
        return false;
    }


}



