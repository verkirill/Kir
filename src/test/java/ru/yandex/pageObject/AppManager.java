package ru.yandex.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class AppManager {
    public WebDriver driver;
    public String baseUrl;

    public NavigationPage navigationPage;
    public LoginIn loginIn;
    public SearchMails searchMails;

    public AppManager() {
        System.setProperty("webdriver.chrome.driver", "/home/kir/chromedriver");
        driver = new ChromeDriver();
        baseUrl = "http://yandex.ru";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        navigationPage = new NavigationPage(this);
        loginIn = new LoginIn(this);
        searchMails = new SearchMails(this);
    }

    public void stop() {
        driver.quit();
    }

}