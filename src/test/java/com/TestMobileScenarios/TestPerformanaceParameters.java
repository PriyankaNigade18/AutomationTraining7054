package com.TestMobileScenarios;

import java.util.List;

import org.testng.annotations.Test;

import com.generic.DriverUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TestPerformanaceParameters {
  @Test
  public void testPerformanceParam() 
  {
	  //create a driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  
	  //get the performance parameter
	  
	  List<String> allTypes=((AndroidDriver)driver).getSupportedPerformanceDataTypes();
	  
	  System.out.println(allTypes);
	  
	  //[cpuinfo, memoryinfo, batteryinfo, networkinfo]
	  
	  //to get the current package name
	  String packageName=((AndroidDriver)driver).getCurrentPackage();
	  System.out.println(packageName);
	  
	  //batteryinfo
	  List<List<Object>> batteryinfo=((AndroidDriver)driver).getPerformanceData(packageName,"batteryinfo",5);
	  
	  System.out.println(batteryinfo);
	  
	  
	 //network
List<List<Object>> networkinfo=((AndroidDriver)driver).getPerformanceData(packageName,"networkinfo",5);
	  
	  System.out.println(networkinfo);
	  
	  //memory
	  
List<List<Object>> memoryinfo=((AndroidDriver)driver).getPerformanceData(packageName,"memoryinfo",5);
	  
	  System.out.println(memoryinfo);
	  
	  
	 //cupinfo
//List<List<Object>> cpuinfo=((AndroidDriver)driver).getPerformanceData(packageName,"cpuinfo",10);
//	  
//	  System.out.println(cpuinfo);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
