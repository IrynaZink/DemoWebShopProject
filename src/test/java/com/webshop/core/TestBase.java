package com.webshop.core;

import come.phonebook.core.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp(){
        app.init();

    }

    @AfterMethod(enabled = true)
    public void tearDown(){
        app.stop();
    }


}
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
