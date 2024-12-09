package com.qa.Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTables {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        //StringBuilder str1=new StringBuilder();
        //total numbers of rows in tables
        int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println(rows);
        
        //total numbers of column
        int col=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        //System.out.println(col);
        
        String str1=driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]//td[2]")).getText();        
        //System.out.println(str1);


        StringBuilder data= new StringBuilder();
        for(int r=2;r<=rows;r++){
            for(int c=1;c<=col;c++){
                data.append(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText());
            }
        }
        //System.out.println(data);
        
        
        driver.quit();

    }
}
