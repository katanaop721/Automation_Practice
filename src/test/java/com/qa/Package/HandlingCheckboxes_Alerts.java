package com.qa.Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckboxes_Alerts {
   public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.navigate().to("https://testautomationpractice.blogspot.com/");
    //SELECT only one checkbox
    //driver.findElement(By.xpath("//input[@id='sunday']")).click();
    //select all checkbox

    List<WebElement> checkbox=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

    // for(int i=0;i<checkbox.size();i++){
    //     checkbox.get(i).click();
    // }

    for(int i=4;i<checkbox.size();i++){
        checkbox.get(i).click();
    }
    System.out.println(checkbox.get(4).isSelected()); // using this I can check that my check box is selected or not
   }   
}
