package com.qa.Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDatePicker {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.get("https://jqueryui.com/datepicker/");
        // Switch to the iframe that contains the datepicker element.
// The jQuery datepicker is embedded within an iframe, so we need to switch to it first.
driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));

// Click on the datepicker input field to open the calendar UI.
driver.findElement(By.xpath("//input[@id='datepicker']")).click();

// Define the desired month and year to select from the datepicker.
String month = "April";
String year = "2026";

// Use a loop to navigate through the calendar until the desired month and year are displayed.
while (true) {
    // Get the currently displayed month and year from the datepicker.
    String actualMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
    String actualYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

    // Check if the current month and year match the desired month and year.
    if (month.equals(actualMonth) && year.equals(actualYear)) {
        // If the desired month and year are displayed, exit the loop.
        break;
    } else {
        // If not, click on the "Next" button to navigate to the next month.
        // The 'ui-icon-circle-triangle-e' class represents the "Next" button in the calendar.
        driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
    }
    }
        //Select date
        String date="25";
        for(int i=1;i<=5;i++){
            for(int j=1;j<=7;j++){  
       String actualDate=driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tr["+i+"]//td["+j+"]")).getText();
       if(actualDate.equals(date)){
        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tr["+i+"]//td["+j+"]")).click();
        break;
       }
    }
    }

            driver.quit();
    }
}
