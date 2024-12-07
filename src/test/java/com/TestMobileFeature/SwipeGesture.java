package com.TestMobileFeature;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.generic.DriverUtil;
import com.generic.Utility;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class SwipeGesture {
  @Test
  public void testSwipe() throws InterruptedException 
  {
	  //create a driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  Utility.getScreenshot(driver,"MobileSession");
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  Utility.getScreenshot(driver,"ViewPage");
	  
	  //gallery
	  driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	  
	  Utility.getScreenshot(driver,"GalleryPage");
	  //photos
	  
	  driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
	  
	  Utility.getScreenshot(driver,"photos");
	  //swipe ele/area
	  WebElement area=driver.findElement(AppiumBy.id("io.appium.android.apis:id/gallery"));
	  
	  //swipeGesture
//	  driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
//			  
//			  "elementId",((RemoteWebElement)area).getId(),
//			  "direction","left",
//			  "percent",1.0
//			  
//			    ));
	  
	  
	  Utility.swipeLeft(driver,area);
	  
	  Thread.sleep(1500);
	  Utility.getScreenshot(driver,"SwipeLeft");
	  
	  Utility.swipeRight(driver,area);
	  Utility.getScreenshot(driver,"rightLeft");
	  
	  
	  
	  
	  
	  
  }
}