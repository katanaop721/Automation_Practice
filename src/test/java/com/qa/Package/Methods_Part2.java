package com.qa.Package;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods_Part2 {
    public static void main(String args[]) {

        // Create an instance of ChromeDriver (launches a new Chrome browser)
        WebDriver driver = new ChromeDriver();

        // Set an implicit wait of 5 seconds for locating elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Open the login page of OrangeHRM demo site
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Print the title of the current webpage to the console
        System.out.println(driver.getTitle());

        // Print the current URL of the webpage to the console
        System.out.println(driver.getCurrentUrl());

        // Optional: Uncomment the line below to print the source code of the current page
        // System.out.println(driver.getPageSource());

        // Get the window handle of the current browser window (unique ID for this window)
        String windowID = driver.getWindowHandle();
        System.out.println(windowID);

        // Note: Every time a new browser session is launched, the window ID will be unique.

        // Click on the link with the text "OrangeHRM, Inc" to open a new tab/window
        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

        // Get the window handles of all open browser windows or tabs
        Set<String> windowID1 = driver.getWindowHandles();
        System.out.println(windowID1);

        // Close all browser windows and terminate the WebDriver session
        driver.quit();
    }
}
