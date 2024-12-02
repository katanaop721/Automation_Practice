package com.qa.Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethods {

        public static void main(String[] args) {
            WebDriver driver=new ChromeDriver();
            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
            //Advantages of Implicit wait
//1.  we have to write only single time
//2. it will not wait till maximum time
//3. applicable for all element
//4. easy to use
        //Thread.sleep --> force karta ha driver ko 

        //Explicit Wait
            //Declaration
            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
            

            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            driver.manage().window().maximize();
            // using explicit wait

           WebElement username= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
           username.sendKeys("Admin"); 

           WebElement password= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
           password.sendKeys("Admin"); 
           
           WebElement loginButton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
           loginButton.click();
           driver.close();
        }
}
