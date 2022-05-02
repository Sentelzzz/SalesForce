package org.example.test;

import org.example.service.NewAccountPageService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateNewAccountTest extends BaseTest{

    NewAccountPageService newAccountPageService;

    @BeforeClass
    public void setUp() {
        newAccountPageService = new NewAccountPageService();
    }

    @Test (description = "Creating new Account")
    public void createNewAccountTest() {
        newAccountPageService.createNewAccount();
        String actualNameCreatedAccount = newAccountPageService.getTextNameCreatedAccount();
        String expectedNameCreatedAccount = newAccountPageService.getAccountName();
        System.out.println("Hello World!");
        Assert.assertTrue(actualNameCreatedAccount.contains(expectedNameCreatedAccount), "New account didn't created!");
    }
}
