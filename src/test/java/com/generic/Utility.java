package com.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;

public class Utility 
{

	
	
	public static void scrollDownUptoCount(AppiumDriver driver,WebElement area,int count)
	{
		for(int i=1;i<=count;i++)
		{
		driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)area).getId(),
				  "direction","down",
				  "percent",1.0
				    ));
		System.out.println("Iteration : "+i);
		}
	}
	
	
	
	public static void scrollDown(AppiumDriver driver,WebElement area)
	{
		driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)area).getId(),
				  "direction","down",
				  "percent",1.0
				    ));
	}
	
	public static void scrollUp(AppiumDriver driver,WebElement area)
	{
		driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)area).getId(),
				  "direction","up",
				  "percent",1.0
				    ));
	}
	
	
	public static void scrollLeft(AppiumDriver driver,WebElement area)
	{
		driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)area).getId(),
				  "direction","left",
				  "percent",1.0
				    ));
	}
	
	public static void scrollRight(AppiumDriver driver,WebElement area)
	{
		driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)area).getId(),
				  "direction","right",
				  "percent",1.0
				    ));
	}
	
	
	
	public static void swipeLeft(AppiumDriver driver,WebElement area)
	{
		driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
				  
				  "elementId",((RemoteWebElement)area).getId(),
				  "direction","left",
				  "percent",1.0
				  
				    ));
	}
	
	
	public static void swipeRight(AppiumDriver driver,WebElement area)
	{
		driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
				  
				  "elementId",((RemoteWebElement)area).getId(),
				  "direction","right",
				  "percent",1.0
				  
				    ));
	}
	
	
	public static void swipeUp(AppiumDriver driver,WebElement area)
	{
		driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
				  
				  "elementId",((RemoteWebElement)area).getId(),
				  "direction","up",
				  "percent",1.0
				  
				    ));
	}
	
	
	
	public static void swipeDown(AppiumDriver driver,WebElement area)
	{
		driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
				  
				  "elementId",((RemoteWebElement)area).getId(),
				  "direction","down",
				  "percent",1.0
				  
				    ));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
