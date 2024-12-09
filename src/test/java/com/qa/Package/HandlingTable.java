package com.qa.Package;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://blazedemo.com/");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        List<WebElement> price = new ArrayList<>();
        for(int i=0;i<6;i++){ 
        
            price.addAll(driver.findElements(By.xpath("//table[@class='table']//tr//td["+i+"]")));
       }

       System.out.print(price);
        // Compare prices
        // System.out.println("Prices: " + prices);
        // System.out.println("Minimum Price: $" + Collections.min(prices));
        // System.out.println("Maximum Price: $" + Collections.max(prices));
}
}
