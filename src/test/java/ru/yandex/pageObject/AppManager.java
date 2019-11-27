package ru.yandex.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class AppManager {
    public WebDriver driver;
    public String baseUrl;
    public String login;
    public String password;

    public NavigationPage navigationPage;
    public LoginPage loginPage;
    public SearchMailsPage searchMailsPage;
    private Properties properties;

    public AppManager(Properties properties) {
        this.properties = properties;
        System.setProperty("webdriver.chrome.driver", "/home/kir/chromedriver");
        driver = new ChromeDriver();
        baseUrl = properties.getProperty("baseUrl");
        login = properties.getProperty("login");
        password = properties.getProperty("password");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        navigationPage = new NavigationPage(this);
        loginPage = new LoginPage(this);
        searchMailsPage = new SearchMailsPage(this);
    }

    public void stop() {
        driver.quit();
    }

}