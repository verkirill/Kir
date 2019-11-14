package ru.yandex;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public WebDriver driver;

    @Before
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "/home/kir/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://yandex.ru");
    }

    @After
    public void Close(){
        driver.quit();
    }

}
