package com.qa.Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_XPath {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        //Using Tag name
        driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
        //Not using Tag name
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("secret_sauce");
        
        //Multiple Attributes
        driver.findElement(By.xpath("//input[@id='login-button'][@name='login-button']")).click();

        driver.findElement(By.xpath("//a[contains(@class,'shopping_cart')]")).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.quit();
    }
}
 