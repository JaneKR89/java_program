package ru.stqa.ptf.addressbook.appmanager;

import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {
    protected ChromeDriver wd;

    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;

    public void init() {
        wd = new ChromeDriver();
        wd.get("http://localhost:8080/addressbook/");
        groupHelper = new GroupHelper(wd);
        sessionHelper = new SessionHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        sessionHelper.login("admin", "secret");
    }


    public void stop() {
        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
