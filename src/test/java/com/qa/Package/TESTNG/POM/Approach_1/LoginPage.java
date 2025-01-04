package com.qa.Package.TESTNG.POM.Approach_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    
    WebDriver driver;
    //Constructor
    LoginPage(WebDriver driver){
        this.driver=driver;
    }

    //locators

    By loginField= By.xpath("//input[@name='user-name']");
    By passwordField=By.xpath("//input[@name='password']");
    By loginButton=By.xpath("//input[@id='login-button']");


    //Actions

    public void enterLogin(String user){
        driver.findElement(loginField).sendKeys(user);
    }
    public void enterPassword(String pass){
        driver.findElement(passwordField).sendKeys(pass);
    }
    public void loginAction(){
        driver.findElement(loginButton).click();
    }

}
