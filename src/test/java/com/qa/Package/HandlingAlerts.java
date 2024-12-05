package com.qa.Package;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
    public static void main(String[] args) {
        
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");

        //1. Normal Alert
         driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
         Alert myalert=driver.switchTo().alert();
         System.out.println(myalert.getText());
         myalert.accept();
        
        //2. Confirmation Alert
         driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
         Alert myalert1=driver.switchTo().alert();
        
         System.out.println(myalert1.getText());
         myalert1.dismiss();
        
        //3. Enter Text on Alert
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert myalert3=driver.switchTo().alert();
        myalert3.sendKeys("prompt testing");

        myalert3.accept();
        
        driver.close();
    }
}
