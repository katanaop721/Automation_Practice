package com.qa.Package.TESTNG.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listener implements ITestListener {
    private ExtentReports extent;
    private ExtentSparkReporter sparkReporter;
    private ExtentTest test;

    // This method is invoked when test execution starts
    public void onStart(ITestContext context) {
        // Initialize ExtentSparkReporter and ExtentReports
        sparkReporter = new ExtentSparkReporter("target/extentReport.html");  // Path where the report will be saved
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        sparkReporter.config().setTheme(Theme.DARK);
        extent.setSystemInfo("Tester Name", "Anku");
        System.out.println("Test execution started....");
    }

    // This method is invoked before a test starts
    public void onTestStart(ITestResult result) {
        // Start logging test details in the report
        test = extent.createTest(result.getName());  // Create a new test in the report with the test name
        System.out.println("Test started: " + result.getName());
    }

    // This method is invoked when a test passes
    public void onTestSuccess(ITestResult result) {
        test.pass("Test passed: " + result.getName());  // Mark the test as passed in the report
        System.out.println("Test passed: " + result.getName());
    }

    // This method is invoked when a test fails
    public void onTestFailure(ITestResult result) {
        test.fail("Test failed: " + result.getName());  // Mark the test as failed in the report
        test.fail(result.getThrowable());  // Log the exception details if the test fails
        System.out.println("Test failed: " + result.getName());
    }

    // This method is invoked when a test is skipped
    public void onTestSkipped(ITestResult result) {
        test.skip("Test skipped: " + result.getName());  // Mark the test as skipped in the report
        System.out.println("Test skipped: " + result.getName());
    }

    // This method is invoked after all tests have been executed
    public void onFinish(ITestContext context) {
        extent.flush();  // Write the results to the report
        System.out.println("Test execution finished....");
    }
}
