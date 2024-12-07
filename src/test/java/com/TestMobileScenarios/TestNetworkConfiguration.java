package com.TestMobileScenarios;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.generic.DriverUtil;
import com.generic.Utility;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TestNetworkConfiguration {
  @Test
  public void testNetworkConfig() throws InterruptedException
  {
	  /*
	   * toggleWifi()
	   * toggleAirPlane()
	   * toggleData()
	   */
	  
	  
	  //create a driver session
	  
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  
	  System.out.println("Initial wifi setup is ON");
	  //OFF
	  ((AndroidDriver)driver).toggleWifi();
	  System.out.println("After toggle wifi setup is OFF");
	  Thread.sleep(1500);
	  //ON
	  ((AndroidDriver)driver).toggleWifi();
	  System.out.println("After toggle wifi setup is ON");

	  //area to swipe left
	  WebElement area=driver.findElement(AppiumBy.id("com.android.systemui:id/tile_page"));
	  Utility.swipeLeft(driver,area);
	  
	  Thread.sleep(1500);
	  
	  //mobile data
	  System.out.println("Initially Mobile data is ON");
	  
	  ((AndroidDriver)driver).toggleData();
	  
	  System.out.println("After toggle Mobile data is OFF");
	  //ON
	  ((AndroidDriver)driver).toggleData();
	  
	  
	  //Airplane mode
	  
	  System.out.println("Initailly Airplane mode will OFF");
	  ((AndroidDriver)driver).toggleAirplaneMode();
	  
	  System.out.println("After toggle  Airplane mode will ON");
	  
	  //off
	  ((AndroidDriver)driver).toggleAirplaneMode();

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
