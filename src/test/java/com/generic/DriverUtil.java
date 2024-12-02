package com.generic;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverUtil
{
	
	public static AppiumDriver driver;
	
	public static AppiumDriver initDriverSession() 
	{
		UiAutomator2Options options=new UiAutomator2Options();
	
		 //app path
		 String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
		
		options.setCapability("appium:app",path);
		
		//server address
		try {
			URL url=new URL("http://0.0.0.0:4723");
			//create driver session
		 driver=new AndroidDriver(url,options);
		 System.out.println("Session id: "+driver.getSessionId());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return driver;
		
	}

}
