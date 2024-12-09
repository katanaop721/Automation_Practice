package com.qa.Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleFrames {
        public static void main(String[] args) {
            WebDriver driver=new ChromeDriver();
            driver.navigate().to("https://ui.vision/demo/webtest/frames/");
            //Swtiched to Frame 1
            WebElement frame= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
            driver.switchTo().frame(frame);
            driver.findElement(By.name("mytext1")).sendKeys("frame test 1");
            //System.out.print(driver.getTitle());
            driver.switchTo().defaultContent(); //go back to the page

            WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
            driver.switchTo().frame(frame2);
            driver.findElement(By.name("mytext2")).sendKeys("frame test 2");

            driver.switchTo().defaultContent();

            WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
            driver.switchTo().frame(frame3);
            driver.findElement(By.name("mytext3")).sendKeys("frame test 2");

            //Inner Iframe
            driver.switchTo().frame(0);
            driver.findElement(By.xpath("//div[@class='AB7Lab Id5V1']")).click();
            WebElement dropdpwn=driver.findElement(By.xpath("//div[@role='listbox']"));
            Select select=new Select(dropdpwn);
            select.selectByIndex(0);
            
            driver.quit();
        }
}
