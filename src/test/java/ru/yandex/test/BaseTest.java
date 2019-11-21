package ru.yandex.test;

import org.junit.After;
import org.junit.Before;
import ru.yandex.pageObject.AppManagerPage;

public class BaseTest {
    protected AppManagerPage app;

    @Before
    public void SetUp() {
        app = new AppManagerPage();
    }

    @After
    public void Close(){
        app.stop();
    }
}