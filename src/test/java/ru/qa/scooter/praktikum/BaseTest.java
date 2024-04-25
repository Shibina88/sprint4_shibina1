package ru.qa.scooter.praktikum;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class BaseTest {
    public WebDriver webDriver;

    @Before
    public void setup() {
        webDriver = new FirefoxDriver();
        webDriver.get("https://qa-scooter.praktikum-services.ru/");

    }

    @After
    public void tearDown() {

        webDriver.quit();
    }
}
