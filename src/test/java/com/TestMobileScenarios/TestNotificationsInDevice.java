package com.TestMobileScenarios;

import java.time.Duration;

import org.testng.annotations.Test;

import com.generic.DriverUtil;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TestNotificationsInDevice {
  @Test
  public void testNotifications()
  {
	  //create a driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  //open notifications
	  ((AndroidDriver)driver).openNotifications();
	  
	  //Notification1
	  String noteHeading1=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Configure physical keyboard\")")).getText();	  
	  System.out.println("Notification 1 Heading is: "+noteHeading1);
	  
	  //open notification 2
	  driver.findElement(AppiumBy.accessibilityId("Expand")).click();
	  
	  //Notification2
	  String noteHeading2=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Appium Settings\").instance(1)")).getText();
	  System.out.println("Notification 2 Heading is: "+noteHeading2);
	  
	  //notification text
	  System.out.println("Notification text is");
	  String text2=driver.findElement(AppiumBy.id("android:id/big_text")).getText();
	  System.out.println(text2);
	  
	  //Notification3
	  String noteHeading3=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Serial console enabled\")")).getText();
	  System.out.println("Notification 3 Heading is: "+noteHeading3);

	  
	  
	  
	  
	  
	  
	  
  }
}
