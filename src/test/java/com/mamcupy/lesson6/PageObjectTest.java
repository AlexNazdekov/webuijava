package com.mamcupy.lesson6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectTest {
    WebDriver driver;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
        driver.get("https://mamcupy.com/");
    }

    @Test
    void likeTouch() throws InterruptedException{
        new MainPage(driver).clickNewButton()
                .likeTouch();
    }

    @AfterEach
        void quitBrowser() {
            driver.quit();
        }
}
