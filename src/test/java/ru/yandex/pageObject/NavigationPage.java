package ru.yandex.pageObject;

import org.openqa.selenium.By;

public class NavigationPage extends BasePage {

    public NavigationPage(AppManagerPage manager) {
        super(manager);
    }

    public void openMainPage() {
        driver.get(manager.baseUrl);
    }

    public void gotoMail(String maillink) {
        driver.findElement(By.className(maillink)).click();
    }
}
