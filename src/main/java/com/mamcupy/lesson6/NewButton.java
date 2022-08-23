package com.mamcupy.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewButton extends BasePage{

    public NewButton(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@data-id='16188']")
    private WebElement likeButton;

    public MainPage likeTouch(){
        likeButton.click();
        return new MainPage(driver);
    }
}
