package com.qa.Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_XPath {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.quit();
    }
}
