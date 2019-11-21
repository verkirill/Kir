package ru.yandex.pageObject;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    public LoginPage(AppManagerPage manager) {
        super(manager);
    }

    public void authorization(String login, String password){
        driver.findElement(By.name("login")).sendKeys(login);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[3]/div[2]/div/div/div[1]/form/div[3]/button[1]")).click();
        driver.findElement(By.name("passwd")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[3]/div[2]/div/div/form/div[2]/button[1]")).click();
    }

}
