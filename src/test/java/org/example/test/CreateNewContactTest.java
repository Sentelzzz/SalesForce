package org.example.test;

import org.example.service.NewContactPageService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateNewContactTest extends BaseTest{

    private NewContactPageService newContactPageService;

    @BeforeClass
    public void setUp() {
        newContactPageService = new NewContactPageService();
    }

    @Test
    public void createNewContactPageTest() {
        newContactPageService.createNewContact();
        String actualNewContact = newContactPageService.getTextActualCreatedContact();
        String expectedNewContact = newContactPageService.getFirstName() + " " + newContactPageService.getLastName();
        Assert.assertTrue(actualNewContact.contains(expectedNewContact), "New contact didn't created!");
    }
}
