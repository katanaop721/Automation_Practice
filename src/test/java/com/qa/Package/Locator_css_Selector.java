package com.qa.Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_css_Selector {
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();
        
        //combination of tag and ID
        driver.findElement(By.cssSelector(".shopping_cart_link")).click();
        

        //tag and attribute
                //tag class and attribute

        driver.findElement(By.cssSelector("button.btn.btn_action.btn_medium.checkout_button[name='checkout']")).click();
        


        
        Thread.sleep(2000);
        

        driver.quit();
    }
}
