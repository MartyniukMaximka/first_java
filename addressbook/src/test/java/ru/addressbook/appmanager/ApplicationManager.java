package ru.addressbook.appmanager;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    FirefoxDriver wd;

    private SessionHalper sessionHalper;
    private NavigationHalper navigationHalper;
    private GroupHelper1 groupHelper1;

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
