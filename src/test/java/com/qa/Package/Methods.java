package com.qa.Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
    public static void main(String args[]) {
        // Initialize the WebDriver and launch a new Chrome browser instance
        WebDriver driver = new ChromeDriver();
        
        // Navigate to the Sauce Demo website
        driver.get("https://www.saucedemo.com/");
        
        // Locate the username input field using XPath and enter the username
        driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
        
        // Locate the password input field using XPath and enter the password
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("secret_sauce");
        
        // Locate the login button using XPath and click to log in
        driver.findElement(By.xpath("//input[@id='login-button'][@name='login-button']")).click();
        
        // Retrieve the current URL of the webpage and store it in a variable
        String URL = driver.getCurrentUrl();
        
        // Retrieve the title of the webpage and store it in a variable
        String title = driver.getTitle();
        
        // Retrieve the page source of the webpage and store it in a variable
        String pageSource = driver.getPageSource();
        
        // Print the current URL to the console
        System.out.print(URL);
        
        // Close the browser and end the session
        driver.quit();
    }    
}
