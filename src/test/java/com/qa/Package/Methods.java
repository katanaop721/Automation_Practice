package com.qa.Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
        public static void main(String args[]){
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button'][@name='login-button']")).click();
        
        String URL=driver.getCurrentUrl();
        String title=driver.getTitle();
        String pageSource=driver.getPageSource();
        
        
        
        System.out.print(URL);

        driver.quit();
    }    
}
