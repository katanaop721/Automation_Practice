package com.qa.Package.TESTNG;
import org.testng.annotations.Test;
//import org.junit.Test;

public class Handlingannotation {
    @Test(priority=1, groups={"sanity"})
    void lauchbrowser(){
        System.out.print("first");
    }
    @Test(priority=3, groups={"sanity"})
    void login(){ 
        System.out.print("first");
    }
    @Test(priority=2, groups={"sanity"})
    void logout(){
        System.out.print("first");
    }
}
