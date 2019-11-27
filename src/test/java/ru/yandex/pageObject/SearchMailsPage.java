package ru.yandex.pageObject;

import org.openqa.selenium.By;

public class SearchMailsPage extends BasePage {
    public SearchMailsPage(AppManager manager) {
        super(manager);
    }

    public int searchMails() {
        int i = driver.findElements(By.xpath("//span[@title='Simbirsoft theme']")).size();
        return i;
    }
}
