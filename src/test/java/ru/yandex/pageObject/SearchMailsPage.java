package ru.yandex.pageObject;

import org.openqa.selenium.By;

public class SearchMailsPage extends BasePage {
    public SearchMailsPage(AppManagerPage manager) {
        super(manager);
    }

    public int searchMails() {
        driver.findElements(By.xpath("//span[@title='Simbirsoft theme']")).size();
        int i = 0;
        return i;
    }
}
