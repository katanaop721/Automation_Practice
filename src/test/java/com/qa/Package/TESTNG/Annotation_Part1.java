package com.qa.Package.TESTNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_Part1 {
    WebDriver driver;

    @BeforeMethod
    void performLogin() {
        // Initialize WebDriver
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        // Navigate to the login page
        driver.get("https://www.saucedemo.com/");
        
        // Perform login
        driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button'][@name='login-button']")).click();
    }

    @Test(priority = 1)
    void performAddtoCart() {
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
    }

    @Test(priority = 2)
    void performAddtoCart1() {
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
    }

    @AfterMethod
    void performLogout() {
        // Perform logout
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
        
        // Close the browser
        driver.quit();
    }
}
