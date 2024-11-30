package com.qa.Package;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods_Part2 {
    public static void main(String args[]){



WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));    //Using Implicit wait     
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
    

        System.out.println(driver.getTitle());  //return the title of the webpage
        System.out.println(driver.getCurrentUrl());   //return current url
        
        //System.out.println(driver.getPageSource());
        String windowID=driver.getWindowHandle();
        System.out.println(windowID);

        //Note: Eberytime we launch a browser the window id changes

        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
        Set<String> windowID1=driver.getWindowHandles();
        System.out.println(windowID1);
        



        driver.quit();


    }
}
