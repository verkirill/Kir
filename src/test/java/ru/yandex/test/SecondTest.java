package ru.yandex.test;

import org.junit.*;

public class SecondTest extends BaseTest {

    @Test
    public void Test1() {
//      Проверка title страницы
        String title = app.driver.getTitle();
        Assert.assertTrue(title.equals("Яндекс"));
     }

    @Test
    public void Test2() {
        app.navigationPage.openMainPage(this);
        app.navigationPage.gotoMail("home-link", this);
        app.loginIn.enterLogin(app.loginIn.searchLogin(this), "логин");
        app.loginIn.enterPassword(app.loginIn.searchPassword(this),"пароль");
        app.searchMails.searchMails(this);
    }
}