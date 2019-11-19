package ru.yandex.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.yandex.test.BaseTest;
import ru.yandex.test.SecondTest;

public class NavigationPage extends Base {

    public NavigationPage(AppManager manager) {
        super(manager);
    }

    public void openMainPage(BaseTest baseTest) {
        driver.get(manager.baseUrl);
    }

    public void gotoMail(String maillink, SecondTest secondTest) {
        WebElement element = driver.findElement(By.className(maillink));
        element.click();
    }
}
