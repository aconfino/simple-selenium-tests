package com.confino.selenium.example.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtils {
	
	public static WebDriver getFirefoxDriver(){
		WebDriver driver = new FirefoxDriver();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	return driver;
	}

}
