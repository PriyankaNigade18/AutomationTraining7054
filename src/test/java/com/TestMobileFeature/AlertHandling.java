package com.TestMobileFeature;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.generic.DriverUtil;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AlertHandling {
  @Test
  public void testAlertHandling() throws InterruptedException
    {
	  
	  //create a driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  
	   //app
	  
	  driver.findElement(AppiumBy.accessibilityId("App")).click();
	  
	  //alert
	  driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
	  
	  
	  //alert1-button1
	  driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
	  //alert will open
	  Thread.sleep(1500);
	  
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Text of alert1: "+alt1.getText());
	  //ok
	  alt1.accept();
	  
	  //button2
	  driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a long message")).click();
	  
	  //alert2
	  Alert alt2=driver.switchTo().alert();	  
	  
	  System.out.println("Text of Alert2: "+alt2.getText());
	  
	  //cancel
	  alt2.dismiss();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
