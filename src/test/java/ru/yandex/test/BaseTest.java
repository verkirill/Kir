package ru.yandex.test;

import org.junit.After;
import org.junit.Before;
import ru.yandex.pageObject.AppManagerPage;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseTest{
    protected AppManagerPage app;

    @Before
    public void SetUp() {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(new File("testinfo.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        app = new AppManagerPage(properties);
    }

    @After
    public void Close(){
        app.stop();
    }
}