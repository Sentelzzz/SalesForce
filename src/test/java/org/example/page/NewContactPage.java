package org.example.page;

import org.example.elements.AccountName;
import org.example.model.Account;
import org.example.model.Contact;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.example.utils.StringConstants.CREATE_NEW_CONTACT_URL;

public class NewContactPage extends BasePage{

    @FindBy (xpath = "//input[@name='lastName']")
    private WebElement lastNameInput;

    @FindBy (xpath = "//input[@name='firstName']")
    private WebElement firstNameInput;

    @FindBy (xpath = "//label[contains(text(), 'Account Name')]/following-sibling::div//input")
    private WebElement accountNameInput;

    @FindBy (xpath = "//button[@name='SaveEdit']")
    private WebElement saveNewContactButton;

    @FindBy (xpath = "//span[contains(@class, 'custom')]/ancestor::div[contains(@class, 'testonly')]")
    private WebElement nameNewContactSpan;

    public String getTextNameNewCreatedContact() {
        return nameNewContactSpan.getText();
    }

    public void clickSaveNewContactButton() {
        saveNewContactButton.click();
    }

    public void fillAccountNameField(String accountName) {
        accountNameInput.sendKeys(accountName);
    }

    public NewContactPage openNewContactPage() {
        driver.get(CREATE_NEW_CONTACT_URL);
        return this;
    }

    public NewContactPage fillFirstNameField(Contact contact) {
        firstNameInput.sendKeys(contact.getFirstName());
        return this;
    }

    public NewContactPage fillLastNameField(Contact contact) {
        lastNameInput.sendKeys(contact.getLastName());
        return this;
    }

    public void choseAccount(String accountName) {
        new AccountName().choseAccount(accountName);
    }
}
