package com.mamcupy.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddFavorites {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://mamcupy.com/");

        driver.findElement(By.id("menu-item-17_1302")).click();
        driver.findElement(By.xpath("//div[@data-id='16188']")).click();

        Thread.sleep(5000);

        driver.quit();
    }
}
