package com.qa.Package.TESTNG.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
    public void onStart(ITestContext context) {
    System.out.print("test execution started....");
  }
  public void onTestStart(ITestResult result) {
    // not implemented
    System.out.print("test started....");
  }
  public void onTestSuccess(ITestResult result) {
    // not implemented
    System.out.print("test pass....");
  }
  public void onTestFailure(ITestResult result) {
    // not implemented
    System.out.print("test fail....");
  }
  public void onTestSkipped(ITestResult result) {
    // not implemented
    System.out.print("test skipped....");
  }
  public void onFinish(ITestContext context) {
    // not implemented
    System.out.print("test finished....");
  }
}
