package com.qa.Package;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) throws InterruptedException{
       
       
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();

        Thread.sleep(5000);

        //Tag name

       List<WebElement> allTagName=driver.findElements(By.tagName("button"));
        
       System.out.println("All Tag Names" + allTagName.size());
        
       List<WebElement> allClassName=driver.findElements(By.className("inventory_item_name"));
        
       System.out.println("All class Names" + allClassName.size());
        
        Thread.sleep(5000);
        driver.quit();



    }



}
