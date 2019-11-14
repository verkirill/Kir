package ru.yandex;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class secondTest extends BaseTest {

    @Test
    public void Test1() {
//      Проверка title страницы
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Яндекс"));

     }
    @Test
    public void Test2() {
        gotoMail("home-link");

        enterLogin(searchLogin(), "verkirill");

        enterPassword();

        searchMails();

    }

    private void searchMails() {
        int mail = driver.findElements(By.xpath("//span[@title='Simbirsoft theme']")).size();
        System.out.println("Количество писем с темой Simbirsoft theme " + mail);
    }

    private void enterPassword() {
        searchPassword("passp-form-field");
        WebElement element3 = driver.findElement(By.id("passp-field-passwd"));
        element3.sendKeys("ByntuhfK123");
        element3.submit();
    }

    private void searchPassword(String s) {
        WebElement element2 = driver.findElement(By.className(s));
        element2.click();
    }

    private void enterLogin(WebElement webElement, String verkirill) {
        WebElement element1 = webElement;
        element1.sendKeys(verkirill);
        element1.submit();
    }

    private WebElement searchLogin() {
        WebElement element1 = driver.findElement(By.name("login"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return element1;
    }

    private void gotoMail(String s) {
        WebElement element = driver.findElement(By.className(s));
        element.click();
    }
}