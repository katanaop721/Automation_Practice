package com.qa.Package.TESTNG.Listeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class Listeners_Testcase {
    WebDriver driver;

    @BeforeClass
    void performLogin() {
        // Initialize WebDriver
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        // Navigate to the login page
        driver.get("https://www.saucedemo.com/");
        
        // Perform login
        driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button'][@name='login-button']")).click();
    }
    @Test(priority = 1)
    void checklogo() {
        boolean status=driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed();
        Assert.assertEquals(status,true);
    }
    @Test(priority = 2)
    void checkPageTitle() {
        String title=driver.getTitle();
        Assert.assertEquals(title,"Swag Labs");
    }
    @AfterClass
    void teardown(){
        driver.quit();
    }
}
