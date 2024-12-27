package com.qa.Package.TESTNG;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class MyFirstTestcasewithTESTNG {
    WebDriver driver;
    @Test(priority=1)
    void openapp(){
         driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.get("https://www.saucedemo.com/");
    }

    @Test(priority=2)
    void testlogin(){
        driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button'][@name='login-button']")).click();

    }

    @Test(priority=3)
    void testLogout(){
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
        driver.quit();
    }


}
