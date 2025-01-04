package com.qa.Package.TESTNG.POM.Approach_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    //Constructor
    LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    //locators
    @FindBy(xpath="//input[@name='user-name']") WebElement loginField;
    @FindBy(xpath="//input[@name='password']") WebElement passwordField;
    @FindBy(xpath="//input[@id='login-button']") WebElement loginButton;


    //Actions

    public void enterLogin(String user){
        loginField.sendKeys(user);
    }
    public void enterPassword(String pass){
        passwordField.sendKeys(pass);
    }
    public void loginAction(){
        loginButton.click();
    }

}
