package org.example.page;

import io.qameta.allure.Step;
import org.example.elements.DropDown;
import org.example.elements.InputField;
import org.example.model.Account;
import org.example.utils.AllureUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.example.utils.StringConstants.*;

public class NewAccountPage extends BasePage{

    @FindBy (xpath = "//button[@title = 'Save']")
    private WebElement saveButton;

    @FindBy (xpath = "//lightning-formatted-text[contains(text(), 'TMS')]/ancestor::div[contains(@class, 'testonly')]")
    private WebElement nameOfAccount;

    public String getTextOfNameOfAccount() {
        return nameOfAccount.getText();
    }

    @Step ("Click button save new Account")
    public void clickOnSaveButton() {
        saveButton.click();
    }

    @Step ("Opening page create new Account")
    public NewAccountPage openNewAccountPage(String url) {
        driver.get(url);
        AllureUtils.takeScreenshot(driver);
        return this;
    }

    @Step ("Fill account name Field")
    public NewAccountPage fillAccountField(Account account) {
        new InputField(ACCOUNT_NAME_FIELD).writeText(account.getAccount());
        return this;
    }

    @Step ("Fill webSite Field")
    public NewAccountPage fillWebSiteField(Account account) {
        new InputField(WEB_SITE_FIELD).writeText(account.getWebSite());
        return this;
    }

    @Step ("Chose industry Type")
    public NewAccountPage choseIndustryType(Account account) {
        new DropDown(INDUSTRY_FIELD).selectOption(account.getIndustry());
        AllureUtils.takeScreenshot(driver);
        return this;
    }


}
