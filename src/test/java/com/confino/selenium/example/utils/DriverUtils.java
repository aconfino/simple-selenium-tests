package com.confino.selenium.example.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtils {

	public static WebDriver getFirefoxDriver(int retryCount) {
		WebDriver driver = null;
		for (int i = 0; i < retryCount; i++) {
			try {
				driver = getFirefoxDriver();
			} catch (Exception e) {
				System.out.println("Unable to open Firefox on attempt " + (i + 1) + ".  Consider lowering the number of tests running in parallel.  The system may be resourced starved.");
			}
			if (driver != null) {
				return driver;
			}
		}
		System.out.println("Could not open browser after " + retryCount + " attempts.");
		return driver;
	}

	public static WebDriver getFirefoxDriver() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}

}
