package ru.yandex;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class secondTest extends WebDriverSetting {

    @Test
    public void Test1() {
//      Проверка title страницы
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Яндекс"));

     }
    @Test
    public void Test2() {
//      Переход с домашней страницы в почту
        WebElement element = driver.findElement(By.className("home-link"));
        element.click();
//      Поиск и ввод логина
        WebElement element1 = driver.findElement(By.name("login"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        element1.sendKeys("verkirill");
        element1.submit();
//      Поиск и ввод пароля
        WebElement element2 = driver.findElement(By.className("passp-form-field"));
        element2.click();
        WebElement element3 = driver.findElement(By.id("passp-field-passwd"));
        element3.sendKeys("");//здесь должен быть пароль
        element3.submit();
//      Поиск кол-ва писем
        int mail = driver.findElements(By.xpath("//span[@title='Simbirsoft theme']")).size();
        System.out.println("Количество писем с темой Simbirsoft theme " + mail);

    }
}