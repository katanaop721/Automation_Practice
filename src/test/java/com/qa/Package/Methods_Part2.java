package com.qa.Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods_Part2 {
    public static void main(String args[]){



WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));    //Using Implicit wait     
        driver.get("https://www.saucedemo.com/");
        //Using Tag name
        driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
        //Not using Tag name
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("secret_sauce");
        
        //Multiple Attributes
        driver.findElement(By.xpath("//input[@id='login-button'][@name='login-button']")).click();
        System.out.println(driver.getWindowHandle());
        driver.quit();


    }
}
