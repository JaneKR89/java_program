package ru.stqa.ptf.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Calendar;

/**
 * HelperBase это обертка на базовые функции селениум
 * */

public class HelperBase {
    protected WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    protected void click(By locator) {
        wd.findElement(locator).click();
    }

    protected void type(By locator, String text) {
        click(locator);
        if (text != null) {
            String existingText = wd.findElement(locator).getAttribute("value");
            if (!text.equals(existingText)) {
                wd.findElement(locator).clear();
                wd.findElement(locator).sendKeys(text);
            }
        }
    }
    public boolean isAlertPresent(){
        try{
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e){
            return false;
        }
    }


    public boolean isElementPresent(By locator) {
        long timer = Calendar.getInstance().getTime().getTime() + (2 * 1000);
        boolean warningShowed = false;
        do {
            try {
                wd.findElement(locator);
                return true;
            } catch (NotFoundException | TimeoutException e) {
                if (!warningShowed) {
                    System.out.println("An Exception occurred after "
                            + "trying to check is element '" + locator
                            + "' PRESENT \nTrying to find the element again with timeout = "
                            + 2);
                    warningShowed = true;
                }
            }
        } while (Calendar.getInstance().getTime().getTime() < timer);
        return false;
    }
}
