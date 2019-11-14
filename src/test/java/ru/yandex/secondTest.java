package ru.yandex;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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

        enterPassword(searchPassword(),"ByntuhfK123");

        searchMails();

    }

    private void searchMails() {
        int mail = driver.findElements(By.xpath("//span[@title='Simbirsoft theme']")).size();
        System.out.println("Количество писем с темой Simbirsoft theme " + mail);
    }

    private void enterPassword(WebElement webElement1,CharSequence password) {
        WebElement element2 = webElement1;
        element2.sendKeys(password);
        element2.submit();
    }

    private WebElement searchPassword() {
        WebElement element2 = driver.findElement(By.className("passp-form-field"));
        element2.click();
        return element2;
    }

    private void enterLogin(WebElement webElement, String login) {
        WebElement element1 = webElement;
        element1.sendKeys(login);
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