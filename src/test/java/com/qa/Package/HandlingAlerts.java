package com.qa.Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");

        //Normal Alert
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        driver.switchTo().alert().accept();
        
    }
}
