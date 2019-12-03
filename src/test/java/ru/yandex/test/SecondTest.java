package ru.yandex.test;

import org.junit.*;

public class SecondTest extends BaseTest {

    @Test
    public void Test1() {
//      Проверка title страницы
        app.navigationPage.openMainPage();
        String title = app.driver.getTitle();
        Assert.assertEquals(title, "Яндекс");
     }

    @Test
    public void Test2() {
        app.navigationPage.openMainPage();
        app.navigationPage.gotoMail("home-link");
        app.loginPage.authorization();
        int mails = app.searchMailsPage.searchMails();
        Assert.assertEquals(mails, 2);
    }
}