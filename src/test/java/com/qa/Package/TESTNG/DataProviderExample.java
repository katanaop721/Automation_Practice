package com.qa.Package.TESTNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderExample {
    WebDriver driver;

    @BeforeClass
    @Parameters({"browser"})
    void setup(String br){

        switch(br){ 
       case "chrome": driver = new ChromeDriver();break;
       case "edge":driver=new EdgeDriver();break;
            default:System.out.println("Null");return;

    }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        // Navigate to the login page
        driver.get("https://www.saucedemo.com/");
    }

    @Test(dataProvider = "dp")
    void login(String username, String password) {
        driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='login-button'][@name='login-button']")).click();
        //driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
    }

    @AfterClass
    void logout() {
        // driver.findElement(By.xpath("//button[@type='button']")).click();
        // driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();

        // Close the browser
        driver.quit();
    }

    @DataProvider(name = "dp",indices={0,2})
    Object[][] logindata() {
         Object data[][]={
            {"locked_out_user","secret_sauce"},
            {"problem_user","secret_sauce"},
            {"performance_glitch_user","secret_sauce"},
         };
        return data;
    }
}
