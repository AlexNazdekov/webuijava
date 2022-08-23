package com.mamcupy.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//li[@id='menu-item-17_1302']")
    private WebElement newButton;

    public NewButton clickNewButton() {
        newButton.click();
        return new NewButton(driver);
    }
}
