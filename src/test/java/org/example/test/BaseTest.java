package org.example.test;

import org.example.driver.DriverSingleton;
import org.example.utils.TestListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

@Listeners(TestListener.class)
public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void startBrowser() {
        driver = DriverSingleton.getDriver();
    }

    @AfterTest
    public void closeBrowser() {
        DriverSingleton.closeDriver();
    }
}
