package com.TestMobileFeature;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.generic.DriverUtil;
import com.generic.Utility;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class TestKeyEventClass {
  @Test
  public void testKeyBoardAction()
  {
	  //create driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  //area
	  WebElement area=driver.findElement(AppiumBy.id("android:id/list"));
	  
	  //scroll 2 time
	  Utility.scrollDownUptoCount(driver,area,3);
	  
	  //textfield
	  driver.findElement(AppiumBy.accessibilityId("TextFields")).click();
	  
	  
	  //text area
	  WebElement textele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit"));
	  
	  
	  //textele.sendKeys("Hello All!");
	  
	  
	 ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.T));
	 ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.E));
	 ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.S));
	 ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.T));
	 ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.I));
	 ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.N));
	 ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.G));
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
