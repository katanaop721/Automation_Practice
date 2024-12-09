package com.qa.Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicPagination {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        //ul[@class='pagination']
        List<WebElement> page=driver.findElements(By.xpath("//ul[@class='pagination']//li"));
        System.out.print(page.size());
        
        //table[@id=productTable]
        StringBuilder data= new StringBuilder();
        int n=1;
        while(n<=page.size()){
            driver.findElement(By.xpath("//ul[@class='pagination']//li["+n+"]")).click();
        for(int r=1;r<6;r++){
            for(int c=1;c<=3;c++){
                data.append(driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td["+c+"]")).getText());
            }
        }
        n++;

    }
        System.out.println("  "+data+" ");
        driver.quit();
    }
}
