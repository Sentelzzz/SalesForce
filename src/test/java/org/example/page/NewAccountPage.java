package org.example.page;

import org.example.elements.DropDown;
import org.example.elements.InputField;
import org.example.model.Account;
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

    public void clickOnSaveButton() {
        saveButton.click();
    }

    public NewAccountPage openNewAccountPage(String url) {
        driver.get(url);
        return this;
    }

    public NewAccountPage fillAccountField(Account account) {
        new InputField(ACCOUNT_NAME_FIELD).writeText(account.getAccount());
        return this;
    }

    public NewAccountPage fillWebSiteField(Account account) {
        new InputField(WEB_SITE_FIELD).writeText(account.getWebSite());
        return this;
    }

    public NewAccountPage choseIndustryType(Account account) {
        new DropDown(INDUSTRY_FIELD).selectOption(account.getIndustry());
        return this;
    }


}
