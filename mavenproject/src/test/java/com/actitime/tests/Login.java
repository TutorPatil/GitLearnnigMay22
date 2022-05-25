package com.actitime.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v100.page.Page.CaptureScreenshotFormat;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.actitime.base.BaseClass;
import com.actitime.utils.CommonUtils;


public class Login extends BaseClass{
	
	//Adding a comment	
	@Test
	public static void login_001() throws Exception
	{
		boolean result = false;			
	   		
		writeInfoLogs("Trying to login to the actitime application by calling login method..");		
		result = CommonUtils.loginToActiTimeApplication();		
		
		// Checking the result to be equal to true
		Assert.assertTrue(result, "Could not login to ActiTime application..");
		
		
	}
	
}
