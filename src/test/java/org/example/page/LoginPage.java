package org.example.page;

import io.qameta.allure.Step;
import org.example.utils.AllureUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@type='email']")
    private WebElement usernameFieldInput;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordFieldInput;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement logInButtonInput;

    @Step("Opening Login Page")
    public LoginPage openPage(String url) {
        driver.get(url);
        AllureUtils.takeScreenshot(driver);
        return this;
    }

    @Step("Fill username Field")
    public LoginPage fillUsernameField(String username) {
        usernameFieldInput.clear();
        usernameFieldInput.sendKeys(username);
        return this;
    }

    @Step("Fill password Field")
    public LoginPage fillPasswordField(String password) {
        passwordFieldInput.clear();
        passwordFieldInput.sendKeys(password);
        AllureUtils.takeScreenshot(driver);
        return this;
    }

    @Step("Click button Login")
    public void clickOnLogInButton() {
        logInButtonInput.click();
    }

}
