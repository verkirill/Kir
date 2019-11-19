package ru.yandex.pageObject;

import org.openqa.selenium.WebDriver;

public abstract class Base {

    protected AppManager manager;
    protected WebDriver driver;


    public Base (AppManager manager){
        this.manager = manager;
        this.driver = manager.driver;
    }
}
