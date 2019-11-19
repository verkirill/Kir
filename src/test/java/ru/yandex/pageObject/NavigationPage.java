package ru.yandex.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NavigationPage extends Base {

    public NavigationPage(AppManager manager) {
        super(manager);
    }

    public void openMainPage() {
        driver.get(manager.baseUrl);
    }

    public void gotoMail(String maillink) {
        WebElement element = driver.findElement(By.className(maillink));
        element.click();
    }
}
