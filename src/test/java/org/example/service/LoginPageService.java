package org.example.service;

import io.qameta.allure.Step;
import org.example.page.LoginPage;
import org.example.page.MainPage;
import org.example.page.NewAccountPage;
import org.testng.annotations.Test;

import static org.example.utils.StringConstants.*;

public class LoginPageService {

    private LoginPage loginPage = new LoginPage();

    @Step ("Opening login page and fill all fields, after that click button login")
    public MainPage login() {
        loginPage.openPage(LOG_IN_URL)
                .fillUsernameField(USERNAME)
                .fillPasswordField(PASSWORD)
                .clickOnLogInButton();
        return new MainPage();
    }
}
