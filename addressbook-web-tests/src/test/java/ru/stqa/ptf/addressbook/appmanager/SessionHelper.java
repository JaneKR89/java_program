package ru.stqa.ptf.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * SessionHelper is the Login Page
 * */
public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver wd) {

        super(wd);
    }

    public void login(String username, String password) {


        type(By.name("user"), username);
        type(By.name("pass"), password);

      click(By.xpath("//form[@id='LoginForm']/input[3]"));
    }

}
