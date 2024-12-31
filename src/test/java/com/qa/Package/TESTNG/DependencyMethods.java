package com.qa.Package.TESTNG;
import org.junit.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {
        @Test(priority=1,groups={"sanity","regression"})
        void openapp(){
            Assert.assertTrue(true);
        }
        @Test(priority=2, dependsOnMethods={"openapp"}, groups={"sanity","regression"})
        void search(){
            Assert.assertTrue(true);
        }
        @Test(priority=3, dependsOnMethods = {"search","openapp"}, groups={"sanity","regression"})
        void logout(){
            Assert.assertTrue(true);
        }
}
