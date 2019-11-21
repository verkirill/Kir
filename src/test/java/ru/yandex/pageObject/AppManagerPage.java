package ru.yandex.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class AppManagerPage {
    public WebDriver driver;
    public String baseUrl;

    public NavigationPage navigationPage;
    public LoginPage loginPage;
    public SearchMailsPage searchMailsPage;

    public AppManagerPage() {
        System.setProperty("webdriver.chrome.driver", "/home/kir/chromedriver");
        driver = new ChromeDriver();
        baseUrl = "http://yandex.ru";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        navigationPage = new NavigationPage(this);
        loginPage = new LoginPage(this);
        searchMailsPage = new SearchMailsPage(this);
    }

    public void stop() {
        driver.quit();
    }

}