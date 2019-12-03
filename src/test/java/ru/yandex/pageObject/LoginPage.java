package ru.yandex.pageObject;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    public LoginPage(AppManager manager) {
        super(manager);
    }

    public void authorization(){
        driver.findElement(By.name("login")).sendKeys(manager.login);
        driver.findElement(By.cssSelector("div.passp-button.passp-sign-in-button")).click();
        driver.findElement(By.name("passwd")).sendKeys(manager.password);
        driver.findElement(By.cssSelector("div.passp-button.passp-sign-in-button")).click();
    }
}
