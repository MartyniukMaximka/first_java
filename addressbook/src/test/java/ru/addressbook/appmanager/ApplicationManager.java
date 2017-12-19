package ru.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    FirefoxDriver wd;

    private SessionHalper sessionHalper;
    private NavigationHalper navigationHalper;
    private GroupHelper1 groupHelper1;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void init() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        groupHelper1 = new GroupHelper1(wd);
        navigationHalper = new NavigationHalper(wd);
        sessionHalper = new SessionHalper(wd);
        sessionHalper.login("admin", "secret");
    }

    public void stop() {
        wd.quit();
    }

    public GroupHelper1 getGroupHelper1() {
        return groupHelper1;
    }

    public NavigationHalper getNavigationHalper() {
        return navigationHalper;
    }
}
