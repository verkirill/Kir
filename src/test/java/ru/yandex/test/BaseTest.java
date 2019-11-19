package ru.yandex.test;

import org.junit.After;
import org.junit.Before;
import ru.yandex.pageObject.AppManager;

public class BaseTest {
    protected AppManager app;

    @Before
    public void SetUp() {
        app = new AppManager();
    }

    @After
    public void Close(){
        app.stop();
    }
}