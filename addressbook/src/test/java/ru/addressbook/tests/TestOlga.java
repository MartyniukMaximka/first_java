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

public class TestOlga {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void TestOlga() {
        wd.get("https://www.etsy.com/?ref=lgo");
        wd.findElement(By.id("sign-in")).click();
        wd.findElement(By.id("username-existing")).click();
        wd.findElement(By.id("username-existing")).clear();
        wd.findElement(By.id("username-existing")).sendKeys("olgastarko");
        wd.findElement(By.id("password-existing")).click();
        wd.findElement(By.id("password-existing")).clear();
        wd.findElement(By.id("password-existing")).sendKeys("olgastarko123");
        wd.findElement(By.id("signin-button")).click();
        wd.findElement(By.linkText("Наша подборка для Olga")).click();
        wd.findElement(By.xpath("//div[@class='content-wrap-inner']/div[2]/div/div/div/div[2]/a/div/div[1]")).click();
        wd.navigate().back();
        wd.navigate().back();
        wd.findElement(By.xpath("//div[@id='content']/div[4]/div/div/div/div[2]/a/span[1]")).click();
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
