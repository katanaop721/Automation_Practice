package com.qa.Package.TESTNG;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {

    //@Test
    void hardassert(){
        String exp="fgjjw";
        String act="Hello";

        Assert.assertEquals(act, exp);
        Assert.assertNotEquals(123,321);
    }

    @Test
    void softassert(){
        String exp="fgjjw";
        String act="Hello";
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(act, exp);
        System.out.print("Hello testing"); 
        //sa.assertNotEquals(321,321);
        sa.assertAll();
    }


}
