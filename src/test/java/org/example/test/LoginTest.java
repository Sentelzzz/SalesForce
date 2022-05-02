package org.example.test;

import io.qameta.allure.Description;
import org.example.page.MainPage;
import org.example.service.LoginPageService;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    private LoginPageService loginPageService;

    @BeforeMethod
    public void setUp() {
        loginPageService = new LoginPageService();
    }

    @Test (description = "Login")
    @Description ("Fill all fields on page and login")
    public void loginTest() {
        MainPage mainPage = loginPageService.login();
        String actualNameOfMainPage = mainPage.getNameOfIndicatorOfMainPage();
        String expectedNameOfMainPage = "Sales";
        Assert.assertEquals(actualNameOfMainPage, expectedNameOfMainPage, "You didn't log in!");
    }

}
