package ru.stqa.ptf.addressbook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkedInLoginTest {
    @Test
    public void loginTest() {

        // open browser
        ChromeDriver driver = new ChromeDriver();

        // open linkedin.com
        driver.get("https://www.linkedin.com/");

        // find signIn BTN


        WebElement signInButton = driver.findElement(By.xpath("//a[@class='nav__button-secondary']"));
        signInButton.click();

        // enter login
        WebElement loginField = driver.findElement(By.id("username"));
        loginField.click();
        loginField.sendKeys("kruhliakova@gmail.com");

        // enter password
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.click();
        passwordField.sendKeys("S1scooby");

        // press login btn

        WebElement mainSignInButton = driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating mercado-button--primary']"));
        mainSignInButton.click();

        // make sure home page is opened
        driver.findElement(By.xpath("//span[@class='global-nav__primary-link-text']"));


    }
}
