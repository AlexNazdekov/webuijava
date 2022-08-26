package com.mamcupy.lesson6;

import com.mamcupy.lesson7.AdditionalLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.events.EventFiringDecorator;


@Story("Добавление в избранное")
public class PageObjectTest {
    WebDriver driver;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new EventFiringDecorator(new AdditionalLogger()).decorate(new ChromeDriver());
        driver.get("https://mamcupy.com/");
    }

    @Test
    @Feature("Избранное")
    @TmsLink("1")
    @DisplayName("Добавление в избранное")
   void likeTouch() throws InterruptedException{
        new MainPage(driver).clickNewButton()
                .likeTouch();
        Assertions.assertEquals(driver.getCurrentUrl(), "https://mamcupy.com/catalog/new/");
    }

    @AfterEach
        void quitBrowser() {
        LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);

        for (LogEntry log: logEntries) {
            Allure.addAttachment("Элемент лога браузера", log.getMessage());
        }

        driver.quit();
        }
}
