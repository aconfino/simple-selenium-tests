package com.confino.selenlum.example.tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.confino.selenium.example.utils.DriverUtils;

public class BaseTest {
	
	WebDriver driver;
	
	@Before
	public void openTheBrowser() {
		driver = DriverUtils.getFirefoxDriver();
	}
	
	@After
	public void closeTheBrowser() {
		driver.quit();
	}

}
