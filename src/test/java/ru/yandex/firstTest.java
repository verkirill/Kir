package ru.yandex;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
    public class firstTest {
        @Test
        public void Test1() {
            System.setProperty("webdriver.chrome.driver","/home/kir/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("http://yandex.ru");
            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            WebElement element = driver.findElement(By.name("text"));
            element.sendKeys("виноград");
            element.submit();
            //driver.quit();

        }
    }




