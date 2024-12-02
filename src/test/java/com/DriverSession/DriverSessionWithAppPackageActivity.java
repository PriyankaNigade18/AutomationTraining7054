package com.DriverSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverSessionWithAppPackageActivity {
  @Test
  public void testDriverSession() throws MalformedURLException 
  {
	  UiAutomator2Options option=new UiAutomator2Options();
	 
	  option.setCapability("appium:appPackage","com.android.deskclock");
	  option.setCapability("appium:appActivity","com.android.deskclock.DeskClock");
	  
	  //server address
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  
	  //create a driver session
	  AppiumDriver driver=new AndroidDriver(url,option);
	  System.out.println("Session id: "+driver.getSessionId());
	  
	  
	  
	  
	  
	  
  }
}
