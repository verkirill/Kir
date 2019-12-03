package ru.yandex.pageObject;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class AppManager {
    public WebDriver driver;
    public String baseUrl;
    public String login;
    public String password;
    public String nodeURL;
    public String browser;

    public NavigationPage navigationPage;
    public LoginPage loginPage;
    public SearchMailsPage searchMailsPage;
    private Properties properties = new Properties();

    public AppManager() throws MalformedURLException {
        loadProperties("testinfo.properties");
//        System.setProperty("webdriver.chrome.driver", "/home/kir/chromedriver");
//        driver = new ChromeDriver();
        nodeURL = properties.getProperty("nodeUrl");
        browser = properties.getProperty("browser");
        baseUrl = properties.getProperty("baseUrl");
        login = properties.getProperty("login");
        password = properties.getProperty("password");
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setBrowserName(browser);
        capability.setPlatform(Platform.LINUX);
        driver = new RemoteWebDriver(new URL(nodeURL), capability);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        navigationPage = new NavigationPage(this);
        loginPage = new LoginPage(this);
        searchMailsPage = new SearchMailsPage(this);
    }

    public void stop() {
        driver.quit();
    }

    private void loadProperties(String filename) {
        try {
            properties.load(new FileReader(new File(filename)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}