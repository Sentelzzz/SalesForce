package org.example.service;

import org.example.page.LoginPage;
import org.example.page.MainPage;
import org.example.page.NewAccountPage;

import static org.example.utils.StringConstants.*;

public class LoginPageService {

    private LoginPage loginPage = new LoginPage();

    public MainPage login() {
        loginPage.openPage(LOG_IN_URL)
                .fillUsernameField(USERNAME)
                .fillPasswordField(PASSWORD)
                .clickOnLogInButton();
        return new MainPage();
    }
}
