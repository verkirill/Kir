package ru.yandex.test;

import org.junit.*;
import ru.yandex.pageObject.SearchMailsPage;

public class SecondTest extends BaseTest {

    @Test
    public void Test1() {
//      Проверка title страницы
        app.navigationPage.openMainPage();
        String title = app.driver.getTitle();
        Assert.assertEquals(title,"Яндекс");
     }

    @Test
    public void Test2() {
        app.navigationPage.openMainPage();
        app.navigationPage.gotoMail("home-link");
        app.loginPage.authorization("логин","пароль");
        int mail = app.searchMailsPage.searchMails();
        Assert.assertEquals(mail,2);
    }
}