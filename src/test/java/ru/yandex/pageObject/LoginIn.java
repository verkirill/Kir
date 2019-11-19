package ru.yandex.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.yandex.test.SecondTest;

public class LoginIn extends Base {
    public LoginIn(AppManager manager) {
        super(manager);
    }

    public WebElement searchLogin(SecondTest secondTest) {
        WebElement element1 = driver.findElement(By.name("login"));
        return element1;
    }

    public void enterLogin(WebElement webElement, String login) {
        WebElement element1 = webElement;
        element1.sendKeys(login);
        element1.submit();
    }

    public WebElement searchPassword(SecondTest secondTest) {
        WebElement element2 = driver.findElement(By.className("passp-form-field"));
        element2.click();
        return element2;
    }

    public void enterPassword(WebElement webElement1, CharSequence password) {
        WebElement element2 = webElement1;
        element2.sendKeys(password);
        element2.submit();
    }
}
