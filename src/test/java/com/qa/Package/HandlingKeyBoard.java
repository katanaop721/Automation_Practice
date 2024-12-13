package com.qa.Package;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingKeyBoard {
public static void main(String[] args) {
    

    WebDriver driver=new ChromeDriver();
    Actions act= new Actions(driver);
    driver.get("https://text-compare.com/");
    driver.findElement(By.xpath("//textarea[@name='text1']")).sendKeys("Copy this and paste it");
    //ctrl+A
    act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
    //ctrl+C
    act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

    //Tab
    act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

    //ctrl+v
    act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
   
    //ctrl+shift+A
    act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();
}
    


}
