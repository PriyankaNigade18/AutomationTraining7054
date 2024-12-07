package com.TestMobileScenarios;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import com.generic.DriverUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Lock_Unlock_RotateDevice {
  @Test
  public void testBesicSetup() throws InterruptedException 
  {
	  //create a driver session
	  
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  //lockDevice()
	  
	  ((AndroidDriver)driver).lockDevice();
	  
	  
	  
	  Thread.sleep(2000);
	  
	  //unlockDevice()
	  
	  ((AndroidDriver)driver).unlockDevice();
	  
	  
	  //rotate
	  ((AndroidDriver)driver).rotate(ScreenOrientation.LANDSCAPE);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 
	  
	  
  }
}
