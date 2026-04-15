package com.webshop.tests;

import com.webshop.core.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageWebShopTests extends TestBase {
    @Test
    public void isElementRegisterPresentTest() {
        //System.out.println("Register is " + isElementRegisterPresent());
        Assert.assertTrue(app.getUser().isElementRegisterPresent());
    }
}
