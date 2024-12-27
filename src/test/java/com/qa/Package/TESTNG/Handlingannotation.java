package com.qa.Package.TESTNG;
import org.testng.annotations.Test;
//import org.junit.Test;

public class Handlingannotation {
    @Test(priority=1)
    void lauchbrowser(){
        System.out.print("first");
    }
    @Test(priority=3)
    void login(){ 
        System.out.print("first");
    }
    @Test(priority=2)
    void logout(){
        System.out.print("first");
    }
}
