package com.qa.Package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingHeadless {
    public static void main(String[] args) {
        
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless=new;");
        
        WebDriver driver = new ChromeDriver(options); 
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        // Navigate to the Sauce Demo website
        driver.navigate().to("https://www.saucedemo.com/");

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.navigate().back();

        driver.navigate().forward();

        driver.quit();
    }
}
