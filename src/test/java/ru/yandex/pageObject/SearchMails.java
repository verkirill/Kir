package ru.yandex.pageObject;

import org.openqa.selenium.By;

public class SearchMails extends Base {
    public SearchMails(AppManager manager) {
        super(manager);
    }

    public void searchMails() {
        int mail = driver.findElements(By.xpath("//span[@title='Simbirsoft theme']")).size();
        System.out.println("Количество писем с темой Simbirsoft theme " + mail);
    }
}
