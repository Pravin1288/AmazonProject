package com.listeners;

import org.checkerframework.common.reflection.qual.GetMethod;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import utility.ExtentManager;
import utility.ExtentTestManager;

public class ListeningTest implements ITestListener {

	
	 public void onTestStart(ITestResult result) {
		   	System.out.println("Running Test Method" + result.getMethod().getMethodName());
		   	ExtentTestManager.startTest(result.getMethod().getMethodName());
		  }

		  public void onTestSuccess(ITestResult result) {
		    // not implemented
			  System.out.println("Test Execution Pass" + result.getMethod().getMethodName());
			  ExtentTestManager.getTest().log(Status.PASS, "TEST PASSED");   
		  }

			/*
			 * public void onTestFailure(ITestResult result) { // not implemented
			 * System.out.println("Test Execution Failed" +
			 * result.getMethod().getMethodName());
			 * ExtentTestManager.getTest().log(Status.FAIL, "TEST FAILED"); }
			 */
		  
		  //To fetch the Failure Exception (Getting the Error/Reason whatever FAILS)
		  public void onTestFailure(ITestResult result) {
			    // not implemented
				  System.out.println("Test Execution Failed" + result.getMethod().getMethodName());
				  ExtentTestManager.getTest().log(Status.FAIL  , result.getThrowable());
			  }

		  public void onTestSkipped(ITestResult result) {
		    // not implemented
			  System.out.println("Test Execution Skipped" + result.getMethod().getMethodName());
			  ExtentTestManager.getTest().log(Status.SKIP, "TEST SKIPPED");  
		  }

		  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		    // not implemented
		  }

		
		  public void onTestFailedWithTimeout(ITestResult result) {
		    onTestFailure(result);
		    //This will automatically pick up the percentage
		  }
	
		  public void onStart(ITestContext context) {
		    // not implemented
			  System.out.println("Test Suite" + context.getName() + "Started");
		  }

		
		  public void onFinish(ITestContext context) {
		    // not implemented
			  System.out.println("Test Finish Suite" + context.getName() + "Finish");
			  ExtentTestManager.endTest();
			  ExtentManager.getInstance().flush();
		  }
		}


