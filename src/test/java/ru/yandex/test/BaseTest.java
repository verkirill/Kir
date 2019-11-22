package ru.yandex.test;

import org.junit.After;
import org.junit.Before;
import ru.yandex.pageObject.AppManagerPage;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class BaseTest{
    protected AppManagerPage app;

    @Before
    public void SetUp() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileReader(new File("testinfo.properties")));
        app = new AppManagerPage(properties);
    }

    @After
    public void Close(){
        app.stop();
    }
}