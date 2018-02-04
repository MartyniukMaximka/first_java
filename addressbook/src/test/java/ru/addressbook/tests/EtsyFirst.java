package ru.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class EtsyFirst {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void EtsyFirst() throws InterruptedException {
        wd.get("https://www.etsy.com/");
        wd.findElement(By.id("sign-in")).click();
        wait(2000);
        wd.findElement(By.xpath("//input[@name='username-existing']")).click();
        wd.findElement(By.xpath("//input[@name='username-existing']")).clear();
        wd.findElement(By.xpath("//input[@name='username-existing']")).sendKeys("olgastarko");

       /* wd.findElement(By.id("username-existing")).click();
        wd.findElement(By.id("username-existing")).clear();
        wd.findElement(By.id("username-existing")).sendKeys("olgastarko");*/
        wd.findElement(By.id("password-existing")).click();
        wd.findElement(By.id("password-existing")).clear();
        wd.findElement(By.id("password-existing")).sendKeys("olgastarko123");
        wd.findElement(By.id("signin-button")).click();
        wd.findElement(By.id("catnav-primary-link-10983")).click();
        wd.findElement(By.id("side-nav-category-link-10996")).click();
        wd.findElement(By.id("catnav-l4-11001")).click();
        wd.findElement(By.linkText("Page 2\n                    \n                    \n                        2")).click();
    }
    
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
