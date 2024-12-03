package com.TestMobileFeature;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.generic.DriverUtil;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class DragGesture {
  @Test
  public void testDragAndDrop()
    {
	  
	  
	//create a driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  
	  
	  //drag n drop
	  
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  //dot 3
	  WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_3"));
	  
	  //dragGesture
	  
	  driver.executeScript("mobile: dragGesture",ImmutableMap.of(
			  
			  "elementId",((RemoteWebElement)ele).getId(),
			  "endX",742,
			  "endY",1113
			  
			  ));
	  
	  //msg
	  String text=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
	  System.out.println("After action result message is: "+text);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
