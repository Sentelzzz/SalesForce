package org.example.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    @FindBy (xpath = "//span[@title='Sales']")
    private WebElement indicatorOfMainPageSpan;

    public String getNameOfIndicatorOfMainPage() {
        return indicatorOfMainPageSpan.getAttribute("title");
    }
}
