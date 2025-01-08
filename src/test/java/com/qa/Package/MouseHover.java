package com.qa.Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
    public static void main(String[] args) {
        // Initialize the WebDriver for Chrome
        WebDriver driver = new ChromeDriver();

        // Navigate to the OpenCart demo website
        driver.get("https://demo-opencart.com/");

        // Create an Actions object for handling advanced user interactions
        Actions actions = new Actions(driver);

        // Perform a mouse hover action over the "Desktops" menu
        WebElement desktopsMenu = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
        actions.moveToElement(desktopsMenu).build().perform();

        // Perform a right-click (context click) on the "Desktops" menu
        actions.contextClick(desktopsMenu).perform();

        // Perform a double-click action
        // Locate the text input field, enter "anku", and then double-click on it
        WebElement inputField = driver.findElement(By.xpath("//input[@type='text']"));
        inputField.sendKeys("anku"); // Enter text in the input field
        actions.doubleClick(inputField).perform();

        // Navigate to a drag-and-drop demo website
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        // Perform a drag-and-drop action
        // Drag the "box3" element (Source) to the "box107" element (Target)
        WebElement source = driver.findElement(By.xpath("//div[@id='box3']"));
        WebElement target = driver.findElement(By.xpath("//div[@id='box107']"));
        actions.dragAndDrop(source, target).perform();


        // Close the browser session
        //driver.quit();
    }
}
