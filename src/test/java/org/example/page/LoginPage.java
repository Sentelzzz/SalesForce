package org.example.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy (xpath = "//input[@type='email']")
    private WebElement usernameFieldInput;

    @FindBy (xpath = "//input[@type='password']")
    private WebElement passwordFieldInput;

    @FindBy (xpath = "//input[@type='submit']")
    private WebElement logInButtonInput;

    public LoginPage openPage(String url) {
        driver.get(url);
        return this;
    }

    public LoginPage fillUsernameField(String username) {
        usernameFieldInput.clear();
        usernameFieldInput.sendKeys(username);
        return this;
    }

    public LoginPage fillPasswordField(String password) {
        passwordFieldInput.clear();
        passwordFieldInput.sendKeys(password);
        return this;
    }

    public void clickOnLogInButton() {
        logInButtonInput.click();
    }

}
