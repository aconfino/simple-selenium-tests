package com.confino.selenlum.example.tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	WebDriver driver;
	
	@Before
	public void openTheBrowser() {
		driver = new FirefoxDriver();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@After
	public void closeTheBrowser() {
		driver.quit();
	}

}
