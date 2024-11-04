package com.qa.Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase {
    public static void main( String[] args )
    {
        WebDriver driver = new ChromeDriver();
        //driver.navigate().
        driver.get("https://www.selenium.dev/documentation/");
       String title=driver.getTitle();
       System.out.println(title);
        driver.quit();
    }
}
