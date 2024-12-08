package com.qa.Package;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertwithExplicitWait {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
         driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        
        Alert myAlert=wait.until(ExpectedConditions.alertIsPresent());
        myAlert.accept();
    }
}
