package com.qa.Package;

import java.beans.BeanInfo;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Test {

    public static void main(String[] args) throws InterruptedException{
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.navigate().to("https://testautomationpractice.blogspot.com/");

        // driver.findElement(By.id("name")).sendKeys("Anku");
        // driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anku123@gmail.com");

        // // driver.findElement(By.linkText("Apple")).click();
        // // driver.navigate().back();
        // // driver.findElement(By.partialLinkText("Leno")).click();

        // System.out.print(driver.getWindowHandle());
        
        

        // List<WebElement> lst=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        // for(int i=0;i<lst.size();i++){
        //     lst.get(i).click();
        // }

        Actions act=new Actions(driver);
        act.doubleClick(driver.findElement(By.xpath("//button[@class='dropbtn']"))).perform();
        



        //handling date picker
        // driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='date-picker-box']")));
        // driver.findElement(By.id("datepicker")).click();

        // String month="April";
        // String Year="2026";


        // while(true){
        //     if(month.equals(driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText()) && Year.equals(driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText())){
        //         break;
        //     }
        //     else{
        //         driver.findElement(By.xpath("//a[@title='Next']")).click();
        //     }
        // }
        // String date="22";
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=7;j++){
        //         String DATE=driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tr["+i+"]//td["+j+"]")).getText();
        //         if(date.equals(DATE)){
        //             driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tr["+i+"]//td["+j+"]")).click();
        //         }
        //     }
        // }

        WebElement drop=driver.findElement(By.xpath("//select[@id='country']"));
        Select slt=new Select(drop);
        slt.selectByVisibleText("Japan");

        // Assert.assertEquals("nothing", driver.getTitle());
        driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
        driver.switchTo().alert().accept();
        act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
        driver.findElement(By.id("singleFileInput")).sendKeys("C:\\Users\\Anku Kumar\\Desktop\\Resume\\New_Resume\\Anku_QA_2Years.pdf");
        Thread.sleep(5000);
        driver.quit();
    }
}
