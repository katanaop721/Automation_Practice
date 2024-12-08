package com.qa.Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthPopup {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        //https://username:password@the-internet.herokuapp.com/basic_auth
        driver.navigate().to("https://username:password@the-internet.herokuapp.com/basic_auth");

    }
}
