package ru.yandex.pageObject;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    protected AppManager manager;
    protected WebDriver driver;


    public BasePage(AppManager manager){
        this.manager = manager;
        this.driver = manager.driver;
    }
}
