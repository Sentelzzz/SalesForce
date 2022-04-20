package org.example.service;

import org.example.model.Contact;
import org.example.page.NewContactPage;

public class NewContactPageService extends LoginPageService{

    private NewContactPage newContactPage = new NewContactPage();
    private NewAccountPageService newAccountPageService = new NewAccountPageService();
    private String firstName = "Vadim";
    private String lastName = "Vadim";

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void createNewContact() {
        login();
        Contact contact = new Contact(firstName, lastName);
        newContactPage.openNewContactPage()
                .fillFirstNameField(contact)
                .fillLastNameField(contact)
                .fillAccountNameField(newAccountPageService.getAccountName());
        newContactPage.choseAccount(newAccountPageService.getAccountName());
        newContactPage.clickSaveNewContactButton();
    }

    public String getTextActualCreatedContact() {
        return newContactPage.getTextNameNewCreatedContact();
    }
}
