package org.example.service;

import org.example.model.Account;
import org.example.page.NewAccountPage;

import static org.example.utils.StringConstants.CREATE_NEW_ACCOUNT_URL;

public class NewAccountPageService extends LoginPageService{

    private NewAccountPage newAccountPage = new NewAccountPage();
    private String accountName = "TMS";
    private String webSite = "http://tms-auto.tilda.ws/qa12-onl";
    private String industryType = "Education";

    public String getAccountName() {
        return accountName;
    }

    public void createNewAccount() {
        login();
        Account account = new Account(accountName, webSite, industryType);
        newAccountPage.openNewAccountPage(CREATE_NEW_ACCOUNT_URL)
                .fillAccountField(account)
                .fillWebSiteField(account)
                .choseIndustryType(account)
                .clickOnSaveButton();
    }

    public String getTextNameCreatedAccount() {
        return newAccountPage.getTextOfNameOfAccount();
    }
}
