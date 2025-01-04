package com.qa.Package.TESTNG.POM.Approach_2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;
    @BeforeClass
    void setup(){
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    void testLogin1(){
        LoginPage lp=new LoginPage(driver);
        lp.enterLogin("standard_user");
        lp.enterPassword("secret_sauce");
        lp.loginAction();

        Assert.assertEquals(driver.getTitle(),"Swag Labs");
    }

    @AfterClass
    void clearall(){
        driver.quit();
    }
}
