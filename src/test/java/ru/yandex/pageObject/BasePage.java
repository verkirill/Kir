package ru.yandex.pageObject;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    protected AppManagerPage manager;
    protected WebDriver driver;


    public BasePage(AppManagerPage manager){
        this.manager = manager;
        this.driver = manager.driver;
    }
}
