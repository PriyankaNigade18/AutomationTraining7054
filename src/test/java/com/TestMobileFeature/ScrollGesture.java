package com.TestMobileFeature;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.generic.DriverUtil;
import com.generic.Utility;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ScrollGesture {
  @Test
  public void testScroll() throws InterruptedException 
  
  {
	  //create   a driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  
	  //click on View
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //ele/area
	  WebElement area=driver.findElement(AppiumBy.id("android:id/list"));
	  
	  
	  //scroll 
	  
//	  driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
//			  "elementId",((RemoteWebElement)area).getId(),
//			  "direction","down",
//			  "percent",1.0
//			    ));
//	  Utility.scrollDown(driver,area);
//	  Utility.scrollDown(driver,area);
	  Utility.scrollDownUptoCount(driver,area,3);
	  Thread.sleep(2000);
	  Utility.scrollUp(driver,area);
	  
	  System.out.println("Scroll Action is completed!");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
