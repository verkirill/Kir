package ru.yandex.test;

import org.junit.After;
import org.junit.Before;
import ru.yandex.pageObject.AppManager;

import java.net.MalformedURLException;
import java.util.Properties;

public class BaseTest{
    protected AppManager app;

    @Before
    public void setUp() throws MalformedURLException {
        app = new AppManager();
    }

    @After
    public void close(){
        app.stop();
    }
}