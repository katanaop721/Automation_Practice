package com.qa.Package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingJavascript {
    public static void main(String[] args) {
        // Initialize the Chrome WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the target URL
        driver.get("https://2009-2017.state.gov/misc/list/index.htm");
        driver.manage().window().maximize();

        // Create an instance of JavascriptExecutor to execute JavaScript commands
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // WAY 1: Scroll down by 3000 pixels
        js.executeScript("window.scrollBy(0,3000)", "");
        // Explanation: The JavaScript function scrolls vertically by 3000 pixels from the current position.

        // WAY 2: Scroll to a specific element
        WebElement ele = driver.findElement(By.xpath("//h2[@id='n']")); // Locate the element with ID 'n'
        js.executeScript("arguments[0].scrollIntoView();", ele);
        // Explanation: Scrolls the page to bring the specified element into view.

        // Print the current vertical scroll position after scrolling to the element
        System.out.println(js.executeScript("return window.pageYOffset;"));
        // Explanation: `window.pageYOffset` returns the number of pixels the document is currently scrolled vertically.

        // WAY 3: Scroll to the bottom of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        // Explanation: `document.body.scrollHeight` gives the total height of the page, ensuring scrolling reaches the bottom.

        // Print the current vertical scroll position after scrolling to the bottom
        System.out.println(js.executeScript("return window.pageYOffset;"));

        js.executeScript("document.body.style.zoom='50%'");
        // Close the browser
        driver.quit();
    }
}
