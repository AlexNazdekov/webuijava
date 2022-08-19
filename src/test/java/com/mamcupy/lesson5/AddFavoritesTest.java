package com.mamcupy.lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddFavoritesTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupBrowser() {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);
    }

    @Test
    void clickToFavorites() throws InterruptedException {
        driver.get("https://mamcupy.com/");

        driver.findElement(By.id("menu-item-17_1302")).click();
        driver.findElement(By.xpath("//div[@data-id='16315']")).click();
        Assertions.assertEquals(driver.getCurrentUrl(), "https://mamcupy.com/catalog/new/");
    }

    @AfterEach
    void quitBrowser() {
        driver.quit();
    }
}
