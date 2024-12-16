package com.qa.Package;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScreenshotHeaadless {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo-opencart.com/");
        driver.manage().window().maximize();

        // Capture full-page screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        // File file = ts.getScreenshotAs(OutputType.FILE);

        // // Save the screenshot to the desired location
        File targetFile = new File("C:\\Users\\Anku Kumar\\Desktop\\AutomationJAVA\\practice\\src\\test\\screenshot\\ParticularSection.png");
        // file.renameTo(targetFile);

        //CAPTURE SPECIF AREA SCREENSHIT
        WebElement divSS=driver.findElement(By.xpath("//div[@class='product-thumb']"));
        File divfile=divSS.getScreenshotAs(OutputType.FILE);
        divfile.renameTo(targetFile);
        driver.quit(); // Quit the browser
    }
}
