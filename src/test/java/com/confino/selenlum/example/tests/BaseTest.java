package com.confino.selenlum.example.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import com.confino.selenium.example.utils.DriverUtils;

public class BaseTest {
	
	WebDriver driver;
	
	@Before
	public void openTheBrowser() {
		driver = DriverUtils.getRemoteFirefoxDriver(5);
		//driver = DriverUtils.getFirefoxDriver();
	}
	
	@After
	public void closeTheBrowser() {
		if(driver != null){
			driver.quit();
		}
	}

}
